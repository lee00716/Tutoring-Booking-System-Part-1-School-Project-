/*
 * File name: Session.Java
 * @author David Lee, 040-959-646
 * Course: CST8288
 * Assignment: Project 1
 * Date: July 8 2019 
 * Professor: George Kriger 
 * Purpose: this class is a structure of a session data
 */
package tutoring.BusinessObjects;

/**
 * this class is a structure of a session data
 * @author David
 */
public class Session {

    private String date;
    private String time;
    private String studentLastName;
    private int sessionStatus;
    private String sessionTopic;
    
        //ID will be automatically given on the database side

    /**
     *
     * @param date date of the session
     * @param time time of the session
     * @param studentLastName student's last name in the session
     * @param sessionStatus session status(available or not)
     * @param sessionTopic session topic(what is covered in the session)
     */

    public Session(String date, String time, String studentLastName, int sessionStatus, String sessionTopic) {
        this.date = date;
        this.time = time;
        this.studentLastName = studentLastName;
        this.sessionStatus = sessionStatus;
        this.sessionTopic = sessionTopic;
    }

    /**
     * 
     * @return date date of the session
     */
    public String getDate() {
        return date;
    }

    /**
     *
     * @param date date of the session
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     *
     * @return time time of the session
     */
    public String getTime() {
        return time;
    }

    /**
     *
     * @param time time of the session
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     *
     * @return studentLastName  student's last name in the session
     */
    public String getStudentLastName() {
        return studentLastName;
    }

    /**
     *
     * @param studentLastName student's last name in the session
     */
    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    /**
     *
     * @return sessionStatus session status(available or not)
     */
    public int getSessionStatus() {
        return sessionStatus;
    }

    /**
     *
     * @param sessionStatus session status(available or not)
     */
    public void setSessionStatus(int sessionStatus) {
        this.sessionStatus = sessionStatus;
    }

    /**
     *
     * @return sessionTopic  session topic(what is covered in the session)
     */
    public String getSessionTopic() {
        return sessionTopic;
    }

    /**
     *
     * @param sessionTopic session topic(what is covered in the session)
     */
    public void setSessionTopic(String sessionTopic) {
        this.sessionTopic = sessionTopic;
    }

}
