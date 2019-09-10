/*
 * File name: Student.Java
 * @author David Lee, 040-959-646
 * Course: CST8288
 * Assignment: Project 1
 * Date: July 8 2019 
 * Professor: George Kriger 
 * Purpose: this class demonstrates a structure of student data
 */
package tutoring.BusinessObjects;

/**
 *this class demonstrates a structure of student data
 * @author David
 */
public class Student implements UserBehavior{
 
    private int studentID;
    private String lastName;
    private String firstName;
    private String email;
    private String phoneNumber;

    /**
     *
     * @return studentID student's ID
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     *
     * @param studentID student's ID
     */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    /**
     *
     * @return lastName student's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName student's last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return firstName student's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName student's first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return email student's email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email student's email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return phoneNumber student's phone number
     */
    public String getPhoneNumber()  {
        return phoneNumber;
    }

    /**
     *
     * @param phoneNumber student's phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
   
    /**
     *Interface optional method
     * @return  UnsupportedOperationException
     */
    @Override
    public String getStatus() {
        throw new UnsupportedOperationException();
    }
    
    //Interface optional method

    /**
     *Interface optional method
     * throws UnsupportedOperationException
     * @param s
     */
    @Override
    public void setStatus(String s) {
        throw new UnsupportedOperationException();
    }

}


