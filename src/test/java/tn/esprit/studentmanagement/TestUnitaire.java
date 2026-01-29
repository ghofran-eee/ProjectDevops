package tn.esprit.studentmanagement;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import tn.esprit.studentmanagement.controllers.StudentController;
import tn.esprit.studentmanagement.entities.Student;
import tn.esprit.studentmanagement.repositories.StudentRepository;
import tn.esprit.studentmanagement.services.StudentService;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class) // tester une méthode sans démarrer toute l'application
public class TestUnitaire {
    /*@Test
    public void contextLoads() {
        // Test basique qui vérifie que le contexte Spring se charge
        assertTrue(true, "Le contexte Spring devrait se charger correctement");
    }

    @Test
    public void simpleAdditionTest() {
        // Test unitaire simple
        int result = 2 + 2;
        assertTrue(result == 4, "2 + 2 devrait être égal à 4");
    }*/
    @Mock
    private StudentRepository studentRepository; //

    @InjectMocks
    private StudentService studentService;

    private Student student1;
    private Student student2;
    @Test
    public void testGetAllStudents_Controller() {
        // Arrange
        // Initialisation des objets de test
        student1 = new Student();
        student1.setIdStudent(1L);
        student1.setFirstName("Ouelhazi");
        student1.setFirstName("Ghofrane");
        student1.setEmail("ouelhazighofrane19@gmail.com");
        student1.setPhone("12345678");
        student1.setDateOfBirth(LocalDate.of(2000, 5, 15));

        student2 = new Student();
        student2.setIdStudent(2L);
        student2.setFirstName("Gharbi");
        student2.setLastName("Fatma");
        student2.setEmail("fatma.gharbi@example.com");
        student2.setPhone("87654321");
        student2.setDateOfBirth(LocalDate.of(2001, 3, 22));
    }

    @Test
    public void testGetAllStudents_EmptyDatabase() {
        // Arrange
        Student student1 = new Student();
        student1.setIdStudent(1L);
        student1.setFirstName("Ouelhazi");
        student1.setLastName("Ghofrane");
        student1.setEmail("ouelhazighofrane19@gmail.com");
        student1.setPhone("12345678");
        student1.setDateOfBirth(LocalDate.of(2000, 5, 15));

        when(studentRepository.findById(1L)).thenReturn(Optional.of(student1));

        // Act
        Student result = studentService.getStudentById(1L);

        // Assert
        assertNotNull(result);
        //assertEquals("Ouelhazi", result.getFirstName());
        assertEquals(student1, result);
        verify(studentRepository, times(1)).findById(1L);
    }

}