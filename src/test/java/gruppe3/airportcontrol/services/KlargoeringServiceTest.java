package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Klargoering;
import gruppe3.airportcontrol.repositories.InMemoryRepository;
import gruppe3.airportcontrol.repositories.KlargoeringRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
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
        // Der bliver der lavet en instans af klargoeringService som får giver
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
        // Mocken bliver sat op, så hver gang mockens metode "findAll()" bliver kaldt vil den returnere arraylist
        // klargoeringList
        when(klargoeringRepository.findAll()).thenReturn(klargoeringList);


        List<Klargoering> alleKlargoeringer = klargoeringService.findAll();
        // Test om servicen returnerede det forventede
        assertEquals(2, alleKlargoeringer.size(), "Længden skal være 2");
        // Test for at klagoeringsRepository.findAll() kun bliver kaldt en gang
        verify(klargoeringRepository, times(1)).findAll();
    }

    @Test
    void save() {
    }

    @Test
    void findById() {
    }

    @Test
    void deleteById() {
    }
}