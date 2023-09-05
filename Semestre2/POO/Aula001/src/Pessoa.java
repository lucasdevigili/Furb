import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Pessoa {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their birthday
        System.out.print("Enter your birthday (format: yyyy-mm-dd): ");
        String birthdayString = scanner.nextLine();
        
        // Parse the user input into a LocalDate object
        LocalDate birthday = LocalDate.parse(birthdayString, DateTimeFormatter.ISO_LOCAL_DATE);
        
        // Calculate the age based on the current date
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthday, currentDate);
        
        // Display the calculated age
        System.out.println("Your age is " + age.getYears() + " years.");
        
        // Close the Scanner object
        scanner.close();
    }
}

