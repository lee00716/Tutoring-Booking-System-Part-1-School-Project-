/*
 * File name: UserDelegatorLauncher.Java
 * @author David Lee, 040-959-646
 * Course: CST8288
 * Assignment: Project 1
 * Date: July 8 2019 
 * Professor: George Kriger 
 * Purpose: this class tests UserDelegator class
 */
package tutoring.BusinessObjects;

/**
 * this class tests UserDelegator class
 * @author David
 */
public class UserDelegatorLauncher {

    /**
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        UserDelegator user = new UserDelegator();
        user.changeUser(new Student());

        user.setFirstName("Scott");
        user.setLastName("Tiger");
        user.setEmail("google@google.com");
        user.setPhoneNumber("1234");

        System.out.println("Printing student information:");
        System.out.printf("%s%n%s%n%s%n%s%n", user.getFirstName(), user.getLastName(), user.getEmail(), user.getPhoneNumber());

        user.changeUser(new Tutor());

        user.setFirstName("Scott");
        user.setLastName("Tiger");
        user.setEmail("google@google.com");
        user.setPhoneNumber("1234");
        user.setStatus("active");

        System.out.println("Printing tutor information:");
        System.out.printf("%s%n%s%n%s%n%s%n%s%n", user.getFirstName(), user.getLastName(), user.getEmail(), user.getPhoneNumber(), user.getStatus());

    }
}
