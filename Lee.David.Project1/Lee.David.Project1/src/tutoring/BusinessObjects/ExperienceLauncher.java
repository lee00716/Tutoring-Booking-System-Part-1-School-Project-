/*
 * File name: ExperienceLauncher.Java
 * @author David Lee, 040-959-646
 * Course: CST8288
 * Assignment: Project 1
 * Date: July 8 2019 
 * Professor: George Kriger 
 * Purpose: tests ExperienceSingleEnum class(Singleton Pattern)
 */
package tutoring.BusinessObjects;

/**
 *tests ExperienceSingleEnum class(Singleton Pattern)
 * @author David
 */
public class ExperienceLauncher {

    /**
     *  tests ExperienceSingleEnum class
     * @param arg command line argument
     */
    public static void main(String arg[]) {
        ExperienceSingleEnum experience1 = ExperienceSingleEnum.FIRSTYEAR;

        System.out.println(experience1);
    }
}
