package tn.esprit.studentmanagement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestUnitaire {
    @Test
    public void testAddition() {
        assertEquals(4, 2 + 2, "2 + 2 devrait être égal à 4");
    }

    @Test
    public void testString() {
        String hello = "Hello Jenkins";
        assertNotNull(hello);
        assertTrue(hello.contains("Jenkins"));
    }
}
