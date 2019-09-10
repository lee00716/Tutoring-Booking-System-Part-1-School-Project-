/*
 * File name: ExperienceDTO.Java
 * @author David Lee, 040-959-646
 * Course: CST8288
 * Assignment: Project 1
 * Date: July 8 2019 
 * Professor: George Kriger 
 * Purpose: this is a DTO for experience data
 */
package tutoring.DTO;

/**
 *
 * @author David
 */
public class ExperienceDTO {

    private int experienceID;
    private String description;

    /**
     *
     * @return experienceID ID of the tutor's experience
     */
    public int getExperienceID() {
        return experienceID;
    }

    /**
     *
     * @param experienceID ID of the tutor's experience
     */
    public void setExperienceID(int experienceID) {
        this.experienceID = experienceID;
    }

    /**
     *
     * @return description description of the experience
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description description of the experience
     */
    public void setDescription(String description) {
        this.description = description;
    }

}
