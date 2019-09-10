/*
 * File name: StudentDTO.Java
 * @author David Lee, 040-959-646
 * Course: CST8288
 * Assignment: Project 1
 * Date: July 8 2019 
 * Professor: George Kriger 
 * Purpose: this JUnit tests StudentDTO
 */
package tutoring.Test;

import org.junit.Test;
import tutoring.DTO.StudentDTO;
import static org.junit.Assert.*;

/**
 *this JUnit tests StudentDTO
 * @author David
 */
public class StudentDTOTest {
    
    public StudentDTOTest() {
    }

    /**
     * Test of setStudentID and getStudentID method, of class StudentDTO.
     */
    @Test
    public void testSetGetStudentID() {
        System.out.println("setStudentID and getStudentID");
        StudentDTO instance = new StudentDTO();
        int expResult = 0;
        instance.setStudentID(expResult);
        int result = instance.getStudentID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastName and getLastName method, of class StudentDTO.
     */
    @Test
    public void testSetGetLastName() {
        System.out.println("setLastName and getLastName");
        StudentDTO instance = new StudentDTO();
        String expResult = "";
        instance.setLastName(expResult);
        String result = instance.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstName and getFirstName method, of class StudentDTO.
     */
    @Test
    public void testSetGetFirstName() {
        System.out.println("setFirstName and getFirstName");
        StudentDTO instance = new StudentDTO();
        String expResult = "";
        instance.setFirstName(expResult);
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail and getEmail method, of class StudentDTO.
     */
    @Test
    public void testSetGetEmail() {
        System.out.println("setEmail and getEmail");
        StudentDTO instance = new StudentDTO();
        String expResult = "";
        instance.setEmail(expResult);
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhoneNumber and getPhoneNumber method, of class StudentDTO.
     */
    @Test
    public void testSetGetPhoneNumber() {
        System.out.println("setPhoneNumber and getPhoneNumber");
        StudentDTO instance = new StudentDTO();
        String expResult = "";
        instance.setPhoneNumber(expResult);
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
    }

}
