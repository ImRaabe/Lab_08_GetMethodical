import java.util.Scanner;
public class PrettyHeader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a message to display in a pretty header: ");
        String message = in.nextLine();
        SafeInput.prettyHeader(message);
    }
}

