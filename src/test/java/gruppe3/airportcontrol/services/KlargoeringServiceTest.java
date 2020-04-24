package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Klargoering;
import gruppe3.airportcontrol.repositories.InMemoryRepository;
import gruppe3.airportcontrol.repositories.KlargoeringRepository;
import javassist.NotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class KlargoeringServiceTest {
    private KlargoeringService klargoeringService;

    // @Mock angiver at vi vil lave en mock af klargoeringRepository
    @Mock
    KlargoeringRepository klargoeringRepository;

    @BeforeEach
    void setUp() {
        // Alle mock annotationerne bliver initialiseret
        MockitoAnnotations.initMocks(this);
        // Der bliver lavet en instans af klargoeringService som får
        // mocken fra før som parameter
        klargoeringService = new KlargoeringService(klargoeringRepository);
    }

    @Test
    void findAll() {
        Klargoering klargoering1 = new Klargoering();
        Klargoering klargoering2 = new Klargoering();
        ArrayList<Klargoering> klargoeringList = new ArrayList<>();
        klargoeringList.add(klargoering1);
        klargoeringList.add(klargoering2);

        // Mocken bliver sat op, så hver gang mockens metode "findAll()"
        // bliver kaldt vil den returnere arraylist klargoeringList
        when(klargoeringRepository.findAll()).thenReturn(klargoeringList);

        List<Klargoering> alleKlargoeringer = klargoeringService.findAll();
        // Test om servicen returnerede det forventede
        assertEquals(2, alleKlargoeringer.size(), "Længden skal være 2");
        // Test for at klagoeringsRepository.findAll() kun bliver kaldt en gang
        verify(klargoeringRepository, times(1)).findAll();
    }

    @Test
    void save() {
        //testdata
        Klargoering klargoering = new Klargoering();
        klargoering.setId(4);

        /*
           Når save(), beder vi repository om at returnere den instans af Klargoering,
          ,som vi lige har lavet
          */
        when(klargoeringRepository.save(any(Klargoering.class))).thenReturn(klargoering);

        /*
          Metoden i service testes. Assertions tjekker, om resultatet er det forventede.
         */
        klargoeringService.save(klargoering);

        assertNotNull(klargoering, "Der er gemt et element");
        assertEquals(4, klargoering.getId(), "Id'et er sat til 4");
        //testes udføres kun en gang
        verify(klargoeringRepository, times(1)).save(klargoering);
    }

    @Test
    void findById() {

        //Testdata
        Klargoering klargoering1 = new Klargoering();
        klargoering1.setId(1);

        /*
          Når findById(), beder vi repository om at returnere instans, vi lige har lavet.
          Metoden returnerer Optional, så Optional.of(). Kan kaste NotFoundException.
          Hvis Optional indeholder instans med det ønskede id, tester vi det med assertion.
          Testen udføres en gang.
         */
        when(klargoeringRepository.findById(1L)).thenReturn(Optional.of(klargoering1));

        try {
            Optional<Klargoering> klargoering2 = klargoeringService.findById(1);

            assertEquals(Optional.of(klargoering1), klargoering2, "Henviser til det samme objekt" );

            if(klargoering2.isPresent()){
                assertEquals(1, klargoering2.get().getId(), "Id'et var sat til 1");}

            verify(klargoeringRepository, times(1)).findById(1L);

        }catch (NotFoundException nf){
            System.out.println(nf);
        }

    }

    @Test
    void deleteById() {
        klargoeringService.deleteById(1);
        verify(klargoeringRepository, times(1)).deleteById(1L);

    }
}
