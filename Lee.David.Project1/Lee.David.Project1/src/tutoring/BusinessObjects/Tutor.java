/*
 * File name: Tutor.Java
 * @author David Lee, 040-959-646
 * Course: CST8288
 * Assignment: Project 1
 * Date: July 8 2019 
 * Professor: George Kriger 
 * Purpose: this class demonstrates a structure of tutor data
 */
package tutoring.BusinessObjects;

/**
 * this class demonstrates a structure of tutor data
 * @author David
 */
public class Tutor implements UserBehavior{
    
    private int tutorID;
    private String lastName;
    private String firstName;
    private String email;
    private String phoneNumber;
    private String status;

    /**
     *
     * @return tutorID tutor's ID
     */
    public int getTutorID() {
        return tutorID;
    }

    /**
     *
     * @param tutorID tutor's ID
     */
    public void setTutorID(int tutorID) {
        this.tutorID = tutorID;
    }

    /**
     *
     * @return lastName tutor's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName tutor's last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return firstName tutor's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName tutor's first name
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
     * @return status availability of the tutor
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status availability of the tutor
     */
    public void setStatus(String status) {
        this.status = status;
    }

}
