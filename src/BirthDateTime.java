import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = SafeInput.getRangedInt(in, "Enter the year of your birth (1950-2015)", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter the month of your birth (1-12)", 1, 12);
        int daysInMonth;

        switch (month) {
            case 2: // February
                daysInMonth = 29; // Leap year consideration not included
                break;
            case 4: case 6: case 9: case 11: // April, June, September, November
                daysInMonth = 30;
                break;
            default: // All other months
                daysInMonth = 31;
                break;
        }
        int day = SafeInput.getRangedInt(in, "Enter the day of your birth (1-" + daysInMonth + ")", 1, daysInMonth);
        int hours = SafeInput.getRangedInt(in, "Enter the hour of your birth (1-24)", 1, 24);
        int minutes = SafeInput.getRangedInt(in, "Enter the minute of your birth (1-59)", 1, 59);

        // Output the entered details
        System.out.println("Your birth date and time: " + month + "-" + day + "-" + year + " at " + hours + ":" + minutes);
    }
}
