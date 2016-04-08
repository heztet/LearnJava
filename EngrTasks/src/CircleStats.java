import java.util.Scanner;

public class CircleStats {
    // Asks the user for the radius of a circle and outputs the area and circumference
    public static void main(String[] args) {
        // Initialize scanner
        Scanner reader = new Scanner(System.in);

        // Get radius from user
        System.out.printf("Enter the radius of the circle (m): ");
        double radius = Double.parseDouble(reader.nextLine());

        // Calculate area and circumference
        double area = Math.PI * Math.pow(radius, 2.0);
        double circumference = 2 * Math.PI * radius;

        // Output information
        System.out.printf("Circle area: %.2f meters\n", area);
        System.out.printf("Circle circumference: %.2f meters\n", circumference);
    }

}
