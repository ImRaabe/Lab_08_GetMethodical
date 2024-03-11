import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Enter your Social Security Number (XXX-XX-XXXX)", "^\\d{3}-\\d{2}-\\d{4}$");
        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number (Mxxxxx)", "^(M|m)\\d{5}$");
        String menuChoice = SafeInput.getRegExString(in, "Choose an option (O: Open, S: Save, V: View, Q: Quit)", "^[OoSsVvQq]$");

        System.out.println("\nSocial Security Number: " + ssn);
        System.out.println("\nUC Student M number: " + mNumber);
        System.out.println("\nMenu choice: " + menuChoice);
    }

}
