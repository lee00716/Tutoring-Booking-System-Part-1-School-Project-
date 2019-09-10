/*
 * File name: SessionDTO.Java
 * @author David Lee, 040-959-646
 * Course: CST8288
 * Assignment: Project 1
 * Date: July 8 2019 
 * Professor: George Kriger 
 * Purpose: this is a DTO for session data
 */
package tutoring.DTO;

/**
 *
 * @author David
 */
public class SessionDTO {
    private String date;
    private String time;
    private String studentLastName;
    private int sessionStatus;
    private String sessionTopic;
    private int tutorID;
    private String courseCode;
    private int studentID;

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
     * @return courseCode the code of the course
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     *
     * @param courseCode the code of the course
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    /**
     *
     * @return student's ID
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
     * @return studentLastName student's last name in the session
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
     * @return sessionStatus availability of the session
     */
    public int getSessionStatus() {
        return sessionStatus;
    }

    /**
     *
     * @param sessionStatus availability of the session
     */
    public void setSessionStatus(int sessionStatus) {
        this.sessionStatus = sessionStatus;
    }

    /**
     *
     * @return sessionTopic topic of the session
     */
    public String getSessionTopic() {
        return sessionTopic;
    }

    /**
     *
     * @param sessionTopic topic of the session
     */
    public void setSessionTopic(String sessionTopic) {
        this.sessionTopic = sessionTopic;
    }

}
