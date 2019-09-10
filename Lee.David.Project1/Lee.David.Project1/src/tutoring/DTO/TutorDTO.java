/*
 * File name: TutorDTO.Java
 * @author David Lee, 040-959-646
 * Course: CST8288
 * Assignment: Project 1
 * Date: July 8 2019 
 * Professor: George Kriger 
 * Purpose: this is a DTO for tutor data
 */
package tutoring.DTO;

/**
 *this is a DTO for tutor data
 * @author David
 */
public class TutorDTO {

    private int tutorID;
    private String lastName;
    private String firstName;
    private String email;
    private String phoneNumber;
    private String status;
    private int experienceID;

    /**
     *
     * @return ID of the tutor's experience
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
     * @return tutorID ID of the tutor
     */
    public int getTutorID() {
        return tutorID;
    }

    /**
     *
     * @param tutorID ID of the tutor
     */
    public void setTutorID(int tutorID) {
        this.tutorID = tutorID;
    }

    /**
     *
     * @return lastName last name of the tutor
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName last name of the tutor
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return firstName first name of the tutor
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName first name of the tutor
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return email tutor's email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email tutor's email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return phoneNumber tutor's phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *
     * @param phoneNumber tutor's phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     *
     * @return status tutor's availability
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status tutor's availability
     */
    public void setStatus(String status) {
        this.status = status;
    }

}
