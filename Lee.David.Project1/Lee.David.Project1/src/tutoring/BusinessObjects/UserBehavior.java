/*
 * File name: UserBehavior.Java
 * @author David Lee, 040-959-646
 * Course: CST8288
 * Assignment: Project 1
 * Date: July 8 2019 
 * Professor: George Kriger 
 * Purpose: this is an interface for tutor and student and demonstrating delagation pattern
 */
package tutoring.BusinessObjects;

/**
 *this is an interface for tutor and student and demonstrating delagation pattern
 * @author David
 */
public interface UserBehavior {

    /**
     *
     * @return lastName last name of the student(tutor or tutee)
     */
    String getLastName();

    /**
     *
     * @param lastName last name of the student(tutor or tutee)
     */
    void setLastName(String lastName);

    /**
     *
     * @return firstName first name of the student(tutor or tutee)
     */
    String getFirstName();

    /**
     *
     * @param firstName first name of the student(tutor or tutee)
     */
    void setFirstName(String firstName);

    /**
     *
     * @return email email of the student(tutor or tutee)
     */
    String getEmail();

    /**
     *
     * @param email email of the student(tutor or tutee)
     */
    void setEmail(String email);

    /**
     *
     * @return phoneNumber phone number of the student(tutor or tutee)
     */
    String getPhoneNumber();

    /**
     *
     * @param phoneNumber phone number of the student(tutor or tutee)
     */
    void setPhoneNumber(String phoneNumber);
    
    /**
     *
     * @return status availability of the tutor
     */
    String getStatus();

    /**
     *
     * @param status availability of the tutor
     */
    void setStatus(String status);

}
