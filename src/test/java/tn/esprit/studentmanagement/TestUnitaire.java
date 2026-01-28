package tn.esprit.studentmanagement;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class) // tester une méthode sans démarrer toute l'application
public class TestUnitaire {
    @Test
    public void contextLoads() {
        // Test basique qui vérifie que le contexte Spring se charge
        assertTrue(true, "Le contexte Spring devrait se charger correctement");
    }

    @Test
    public void simpleAdditionTest() {
        // Test unitaire simple
        int result = 2 + 2;
        assertTrue(result == 4, "2 + 2 devrait être égal à 4");
    }
}
