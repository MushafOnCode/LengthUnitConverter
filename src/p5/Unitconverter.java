package p5;
import java.util.Scanner;



public class Unitconverter {
    public static double feetToMeters(double feet) {
        return feet * 0.3048; // 1 foot is approximately 0.3048 meters
    }

    public static double metersToFeet(double meters) {
        return meters / 0.3048; // 1 meter is approximately 3.28084 feet
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: java p5.Unitconverter <feetValue> <metersValue>");
            System.exit(1);
        }

        double feetValue = Double.parseDouble(args[0]);
        double metersValue = Double.parseDouble(args[1]);

        System.out.println(feetValue + " feet is equal to " + feetToMeters(feetValue) + " meters");
        System.out.println(metersValue + " meters is equal to " + metersToFeet(metersValue) + " feet");
    }
}


