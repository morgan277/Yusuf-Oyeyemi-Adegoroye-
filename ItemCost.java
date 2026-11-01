import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Item Cost Calculator ===");
        System.out.print("Enter item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter price per item: ");
        double price = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        if (price < 0 || quantity < 0) {
            System.out.println("Price and quantity cannot be negative.");
            input.close();
            return;
        }

        double totalCost = price * quantity;

        System.out.println("\n--- Purchase Summary ---");
        System.out.println("Item: " + itemName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total cost: " + totalCost);

        input.close();
    }
}
