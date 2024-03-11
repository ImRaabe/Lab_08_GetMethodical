import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;

        do {
            double itemPrice = SafeInput.getRangedDouble(in, "Enter the price of the item ($0.50 to $10.00)", 0.50, 10.00);
            totalCost += itemPrice;

            System.out.println("Total cost so far: $" + String.format("%.2f", totalCost));

        } while (SafeInput.getYNConfirm(in, "Do you have more items to purchase? (Y/N): "));

        System.out.printf("Total cost: $%.2f\n", totalCost);
    }
}
