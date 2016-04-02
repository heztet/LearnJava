import java.util.Scanner;

public class TankDimensions {
    // Takes the diameter and height of a tank in meters and calculates
    // the volume, height, and diameter in both feet and feet/inches

    public static void main(String[] args) {
        // Initialize scanner
        Scanner reader = new Scanner(System.in);

        // User input
        System.out.printf("Enter diameter (m): ");
        double diameter_m = Double.parseDouble(reader.nextLine());
        System.out.printf("Enter height (m): ");
        double height_m = Double.parseDouble(reader.nextLine());

        // Calculate volume, height, and diameter in feet
        double meterToFeet = 3.28084;
        double diameter_ft = diameter_m * meterToFeet;
        double height_ft = height_m * meterToFeet;
        double vol_ft = Math.PI * height_ft * Math.pow(diameter_ft / 2.0, 2.0);

        // Calculate volume in gals
        double vol_gal = vol_ft * 7.48052;

        // Calculate height and diameter in ft and in
        double diameter_in = (diameter_ft - Math.floor(diameter_ft)) * 12;
        double height_in = (height_ft - Math.floor(height_ft)) * 12;

        // Output results
        System.out.println();
        System.out.printf("Volume in US gallons: %.1f\n", vol_gal);
        System.out.printf("Height in ft: %.1f\n", height_ft);
        System.out.printf("Diameter in ft: %.1f\n", diameter_ft);
        System.out.println();
        System.out.printf("Height in ft and in: %.0f ft %.1f in\n", height_ft, height_in);
        System.out.printf("Diameter in ft and in: %.0f ft %.1f in\n", diameter_ft, diameter_in);
    }
}
