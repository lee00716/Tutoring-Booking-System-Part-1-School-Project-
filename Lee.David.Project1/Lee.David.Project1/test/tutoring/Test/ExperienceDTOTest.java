/*
 * File name: TutorDTO.Java
 * @author David Lee, 040-959-646
 * Course: CST8288
 * Assignment: Project 1
 * Date: July 8 2019 
 * Professor: George Kriger 
 * Purpose: this JUnit tests ExperienceDTO
 */
package tutoring.Test;

import org.junit.Test;
import tutoring.DTO.ExperienceDTO;
import static org.junit.Assert.*;

/**
 *this JUnit tests ExperienceDTO
 * @author David
 */
public class ExperienceDTOTest {
    
    /**
     *this JUnit tests ExperienceDTO
     */
    public ExperienceDTOTest() {
    }

    /**
     * Test of setExperienceID and getExperienceID method, of class ExperienceDTO.
     */
    @Test
    public void testSetGetExperienceID() {
        System.out.println("setExperienceID and getExperienceID");
        int setID = 1;
        ExperienceDTO instance = new ExperienceDTO();
        instance.setExperienceID(setID);
        int getID = instance.getExperienceID();
        assertEquals(setID, getID);
    }

    /**
     * Test of getDescription and setDescription method, of class ExperienceDTO.
     */
    @Test
    public void testSetGetDescription() {
        System.out.println("getDescription and setDescription");
        String setDescription = "abc";
        ExperienceDTO instance = new ExperienceDTO();
        instance.setDescription(setDescription);
        String getDescription = instance.getDescription();
        assertEquals(setDescription, getDescription);
    }

}
