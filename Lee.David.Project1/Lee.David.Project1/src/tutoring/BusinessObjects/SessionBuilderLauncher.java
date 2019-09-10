/*
 * File name: SessionBuilderLauncher.Java
 * @author David Lee, 040-959-646
 * Course: CST8288
 * Assignment: Project 1
 * Date: July 8 2019 
 * Professor: George Kriger 
 * Purpose: this class tests SessionBuilder class
 */
package tutoring.BusinessObjects;


/**
 *this class tests SessionBuilder class
 * @author David
 */
public class SessionBuilderLauncher {

    /**
     *
     * @param arg command line argument
     */
    public static void main(String arg[]){
    SessionBuilder sb = new SessionBuilder();
    Session session = sb.setDate("07-07-2019").setTime("13:00").setLastName("Tiger").setSessionStatus(1).setSessionTopic("math100").createSession();

 System.out.printf("%s%n%s%n%s%n%s%n%s%n", session.getStudentLastName(), session.getDate(), session.getTime(), session.getSessionStatus(), session.getSessionTopic());

    }
}
