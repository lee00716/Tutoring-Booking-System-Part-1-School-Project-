/*
 * File name: SessionDTO.Java
 * @author David Lee, 040-959-646
 * Course: CST8288
 * Assignment: Project 1
 * Date: July 8 2019 
 * Professor: George Kriger 
 * Purpose: this JUnit tests SessionDTO
 */
package tutoring.Test;

import org.junit.Test;
import tutoring.DTO.SessionDTO;
import static org.junit.Assert.*;

/**
 *this JUnit tests SessionDTO
 * @author David
 */
public class SessionDTOTest {
    
    public SessionDTOTest() {
    }

    /**
     * Test of setDate and getDate method, of class SessionDTO.
     */
    @Test
    public void testSetGetDate() {
        System.out.println("setDate and getDate");
        SessionDTO instance = new SessionDTO();
        String expResult = "abc123";
        instance.setDate(expResult);
        String result = instance.getDate();
        assertEquals(expResult, result);
    }


    /**
     * Test of getTime method, of class SessionDTO.
     */
    @Test
    public void testSetGetTime() {
        System.out.println("setTime and getTime");
        SessionDTO instance = new SessionDTO();
        String expResult = "abc123";
        instance.setTime(expResult);
        String result = instance.getTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of set StudentLastName and getStudentLastName method, of class SessionDTO.
     */
    @Test
    public void testSetGetStudentLastName() {
        System.out.println("setStudentLastName and getStudentLastName");
        SessionDTO instance = new SessionDTO();
        String expResult = "lee";
        instance.setStudentLastName(expResult);
        String result = instance.getStudentLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSessionStatus and getSessionStatus method, of class SessionDTO.
     */
    @Test
    public void testSetGetSessionStatus() {
        System.out.println("setSessionStatus and getSessionStatus");
        SessionDTO instance = new SessionDTO();
        int expResult = 0;
        instance.setSessionStatus(expResult);
        int result = instance.getSessionStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSessionTopic and getSessionTopic method, of class SessionDTO.
     */
    @Test
    public void testSetGetSessionTopic() {
        System.out.println("setSessionTopic and getSessionTopic");
        SessionDTO instance = new SessionDTO();
        String expResult = "";
        instance.setSessionTopic(expResult);
        String result = instance.getSessionTopic();
        assertEquals(expResult, result);
    }

    
}
