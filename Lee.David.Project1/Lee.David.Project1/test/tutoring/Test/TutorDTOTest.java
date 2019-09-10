/*
 * File name: TutorDTO.Java
 * @author David Lee, 040-959-646
 * Course: CST8288
 * Assignment: Project 1
 * Date: July 8 2019 
 * Professor: George Kriger 
 * Purpose: this JUnit tests TutorDTO
 */
package tutoring.Test;

import org.junit.Test;
import tutoring.DTO.TutorDTO;
import static org.junit.Assert.*;

/**
 * this JUnit tests TutorDTO
 * @author David
 */
public class TutorDTOTest {
    
    public TutorDTOTest() {
    }

    /**
     * Test of setTutorID getTutorID method, of class TutorDTO.
     */
    @Test
    public void testSetGetTutorID() {
        System.out.println("setTutorID getTutorID");
        TutorDTO instance = new TutorDTO();
        int expResult = 0;
        instance.setTutorID(expResult);
        int result = instance.getTutorID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastName getLastName method, of class TutorDTO.
     */
    @Test
    public void testSetGetLastName() {
        System.out.println("setLastName getLastName");
        TutorDTO instance = new TutorDTO();
        String expResult = "";
        instance.setLastName(expResult);
        String result = instance.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstName getFirstName method, of class TutorDTO.
     */
    @Test
    public void testSetGetFirstName() {
        System.out.println("setFirstName getFirstName");
        TutorDTO instance = new TutorDTO();
        String expResult = "";
        instance.setFirstName(expResult);
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail getEmail method, of class TutorDTO.
     */
    @Test
    public void testSetGetEmail() {
        System.out.println("setEmail getEmail");
        TutorDTO instance = new TutorDTO();
        String expResult = "";
        instance.setEmail(expResult);
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhoneNumber getPhoneNumber method, of class TutorDTO.
     */
    @Test
    public void testSetGetPhoneNumber() {
        System.out.println("setPhoneNumber getPhoneNumber");
        TutorDTO instance = new TutorDTO();
        String expResult = "";
        instance.setPhoneNumber(expResult);
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStatus getStatus method, of class TutorDTO.
     */
    @Test
    public void testSetGetStatus() {
        System.out.println("setStatus getStatus");
        TutorDTO instance = new TutorDTO();
        String expResult = "";
        instance.setStatus(expResult);
        String result = instance.getStatus();
        assertEquals(expResult, result);
    }
    
}
