import java.util.Scanner;

public class exp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter day (1-31):");
        int day = sc.nextInt();

        System.out.println("Enter month (1-12):");
        int month = sc.nextInt();

        System.out.println("Enter year:");
        int year = sc.nextInt();

        // Validate the input date
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid date input.");
            sc.close();
            return;
        }

        // Adjust month and year for Zeller's Congruence
        if (month < 3) {
            month += 12;
            year--;
        }

        // Zeller's Congruence formula to find day of the week
        int k = year % 100;
        int j = year / 100;
        int h = (day + (13 * (month + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;

        // Day of the week mapping
        String[] daysOfWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String dayOfWeek = daysOfWeek[h];

        // Display the day of the week
        System.out.println("The day for the given date is: " + dayOfWeek);

        sc.close();
    }
}
