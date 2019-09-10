/*
 * File name: SessionBuilder.Java
 * @author David Lee, 040-959-646
 * Course: CST8288
 * Assignment: Project 1
 * Date: July 8 2019 
 * Professor: George Kriger 
 * Purpose: this class demonstrates Builder pattern
 */
package tutoring.BusinessObjects;

/**
 * this class demonstrates Builder pattern
 * @author David
 */
public class SessionBuilder {
    private String date;
    private String time;
    private String studentLastName;
    private int sessionStatus;
    private String sessionTopic;

    //ID will be automatically given in the database side

    /**
     *this class demonstrates Builder pattern
     */
    
    public SessionBuilder() {
    }

    /**
     *
     * @param studentLastName student's last name in the session
     * @return SessionBuilder object
     */
    public SessionBuilder setLastName(String studentLastName) {
        this.studentLastName = studentLastName;
        return this;
    }

    /**
     *
     * @param date date of the session
     * @return SessionBuilder object
     */
    public SessionBuilder setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     *
     * @param time time of the session
     * @return SessionBuilder object
     */
    public SessionBuilder setTime(String time) {
        this.time = time;
        return this;
    }

    /**
     *
     * @param sessionStatus session status(available or not)
     * @return SessionBuilder object
     */
    public SessionBuilder setSessionStatus(int sessionStatus) {
        this.sessionStatus = sessionStatus;
        return this;
    }

    /**
     *
     * @param sessionTopic session topic(what is covered in the session)
     * @return SessionBuilder object
     */
    public SessionBuilder setSessionTopic(String sessionTopic) {
        this.sessionTopic = sessionTopic;
        return this;
    }

    /**
     *
     * @return Session object
     */
    public Session createSession() {
        return new Session(date, time, studentLastName, sessionStatus, sessionTopic);
    }


}
