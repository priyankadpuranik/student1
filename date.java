import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class date {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for the student's name
        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine();

        // Prompt for the student's date of birth in the specified formats
        System.out.print("Enter the student's date of birth (DD-MM-YYYY or YYYY-MM-DD): ");
        String dobInput = scanner.nextLine();

        // Parse the date of birth input
        LocalDate dob = LocalDate.parse(dobInput);

        // Calculate the age
        int age = calculateAge(dob);

        // Display the student's name and age
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);

        scanner.close();
    }

    // Helper method to calculate age
    public static int calculateAge(LocalDate dob) {
        LocalDate currentDate = LocalDate.now();
        if ((dob != null) && (currentDate != null)) {
            return Period.between(dob, currentDate).getYears();
        } else {
            return 0;
        }
    }
}
