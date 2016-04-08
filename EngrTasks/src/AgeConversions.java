import java.util.Scanner;

public class AgeConversions {
    // This program outputs a user's name and age (in both minutes and years) when given their name, age in years,
    // and days since their last birthday.

    public static void main(String[] args) {
        // Initialize scanner
        Scanner reader = new Scanner(System.in);

        // Input name
        System.out.printf("Enter your last name: ");
        String lastName = reader.nextLine();
        System.out.printf("Enter your first name: ");
        String firstName = reader.nextLine();

        // Input age information
        System.out.printf("Enter your age in years: ");
        double ageYears = Float.parseFloat(reader.nextLine());
        System.out.printf("Enter days since last birthday: ");
        int daysPassed = Integer.parseInt(reader.nextLine());

        // Calculations on age
        double yearsToMinutes = ageYears * 365.242199 * 24 * 60;
        double daysToMinutes = daysPassed * 24 * 60;
        double totalAgeMinutes = yearsToMinutes + daysToMinutes;
        double daysToYears = daysPassed / 365.242199;
        double totalAgeYears = ageYears + daysToYears;

        // Output information
        System.out.printf("Full name: %s %s\n", firstName, lastName);
        System.out.printf("Age in minutes: %.2f\n", totalAgeMinutes);
        System.out.printf("Age in years: %.2f\n", totalAgeYears);
    }
}