/*
 * File name: UserDelegator.Java
 * @author David Lee, 040-959-646
 * Course: CST8288
 * Assignment: Project 1
 * Date: July 8 2019 
 * Professor: George Kriger 
 * Purpose: this is a delegator class for tutor and student and demonstrating delagation pattern
 */
package tutoring.BusinessObjects;


/**
 *this is a delegator class for tutor and student and demonstrating delagation pattern
 * @author David
 */
public class UserDelegator {

    private UserBehavior userType;

    /**
     * instantiates userType as a student
     */
    public UserDelegator() {
        this.userType = new Student();
    }

    /**
     *
     * @param lastName last name of the student(totur or tutee)
     */
    public void setLastName(String lastName) {
        this.userType.setLastName(lastName);
    }

    /**
     *
     * @return lastName last name of the student(totur or tutee)
     */
    public String getLastName() {
        return this.userType.getLastName();
    }

    /**
     *
     * @return firstName first name of the student(totur or tutee)
     */
    public String getFirstName() {
        return this.userType.getFirstName();
    }

    /**
     *
     * @param firstName first name of the student(totur or tutee)
     */
    public void setFirstName(String firstName) {
        this.userType.setFirstName(firstName);
    }

    /**
     *
     * @return email email of the student(totur or tutee)
     */
    public String getEmail() {
        return this.userType.getEmail();
    }

    /**
     *
     * @param email email of the student(totur or tutee)
     */ 
    public void setEmail(String email) {
        this.userType.setEmail(email);
    }

    /**
     *
     * @return phoneNumber phone number of the student(totur or tutee)
     */
    public String getPhoneNumber() {
        return this.userType.getPhoneNumber();
    }

    /**
     *
     * @param phoneNumber phone number of the student(totur or tutee)
     */
    public void setPhoneNumber(String phoneNumber) {
        this.userType.setPhoneNumber(phoneNumber);
    }
    
    /**
     *
     * @return status availability of the tutor
     */
    public String getStatus(){
        return this.userType.getStatus();
    }
    
    /**
     *
     * @param status  availability of the tutor
     */
    public void setStatus(String status){
        this.userType.setStatus(status);
    }

    /**
     * changes the behavior to the userType that was given
     * @param userType
     */
    public void changeUser(UserBehavior userType) {
        this.userType = userType;
    }
    
}
