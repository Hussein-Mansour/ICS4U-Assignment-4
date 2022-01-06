/*
* This program is the Main() program.
* This Program calculates:
* The area, perimeter, angles and type of a Triangle.
*
* @author  Hussein Mansour
* @version 1.0
* @since   2022-1-5
*/

import java.util.Scanner;

/**
* This is the Main class program.
*/
final class Main {

    /**
    * Space.
    */
    public static final String SPACE = "\n";

    /**
    * 90 Degree.
    */
    public static final double DEGREE = 90;

    /**
    * Cm.
    */
    public static final String CM = " Cm.";

    /**
    * Degree Symbole.
    */
    public static final String SYMB = "°";

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Starting... the main method
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        // Starting..
        System.out.print("This Program Calculates: ");
        System.out.print("The (Area, Perimeter, Angles and Type)");
        System.out.print(" of a Triangle.");
        System.out.print(SPACE);
        System.out.println(SPACE + "Starting: " + SPACE);
        // Try and catch.
        try {
            // Scanner Object 1.
            final Scanner myObj = new Scanner(System.in);
            // User Input 1
            System.out.print("Sides in Cm!");
            System.out.println(SPACE);
            System.out.print("Enter Side A: ");
            final double input = myObj.nextInt();
            // Scanner Object 2.
            final Scanner myObjj = new Scanner(System.in);
            // User Input 2.
            System.out.print("Enter Side B: ");
            final double inputt = myObj.nextInt();
            // Scanner Object 3.
            final Scanner myObjjj = new Scanner(System.in);
            // User Input 3.
            System.out.print("Enter Side C: ");
            final double inputtt = myObj.nextInt();
            // calling functions from Triangle class.
            final Triangle process = new Triangle(input, inputt, inputtt);
            // Output.
            // Area.
            System.out.print(SPACE);
            System.out.println("--> The Area is : "
                            + process.heronFormula(input, inputt, inputtt)
                            + CM);
            // Perimeter.
            System.out.println("--> The Perimeter is: "
                            + process.parameter(input, inputt, inputtt)
                            + CM);
            // Angles.
            // Angle A
            final double angleA = process.angleA(input, inputt, inputtt);
            // Angle B
            final double angleB = process.angleB(input, inputt, inputtt);
            // Angle C
            final double angleC = process.angleC(input, inputt, inputtt);
            // Print All Angles.
            System.out.print(SPACE);
            System.out.println("Measure of the 3 Angles: ");
            System.out.print(SPACE);
            System.out.println("--> Angle A: " + angleA + SYMB);
            System.out.println("--> Angle B: " + angleB + SYMB);
            System.out.println("--> Angle C: " + angleC + SYMB);
            // If Triangle is right or non-right.
            if (angleA == DEGREE || angleB == GEGREE || angleC == DEGREE) {
                System.out.print(SPACE);
                System.out.println("Type: Right Triangle.");
            } else {
                System.out.print(SPACE);
                System.out.println("Type: Non-Right Triangle.");
            }
        } catch (java.util.InputMismatchException errorCode) {
            // Error.
            System.out.println(SPACE + "Invalid Input!");
        }
        // Done.
        System.out.println(SPACE + "Done.");
    }
}
