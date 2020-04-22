package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Klargoering;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class KlargoeringServiceTest {

    @Resource
    private KlargoeringService klargoeringService;

    @Test
    void findAll() {

        Klargoering klargoering1 = new Klargoering();
        Klargoering klargoering2 = new Klargoering();

        klargoeringService.save(klargoering1);
        klargoeringService.save(klargoering2);

        List<Klargoering> alleKlargoeringer = klargoeringService.findAll();

        assertEquals(2, alleKlargoeringer.size(), "Længden skal være 2");

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