import java.util.Scanner;

public class Canteen {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int totalQuantity = 0;
        double totalAmount = 0;
        double totalDeduction = 0;

        char again = 'Y';

        // Display menu
        System.out.println("===== M E N U =====");
        System.out.println("1. Burger     - $80.00");
        System.out.println("2. Pizza      - $120.00");
        System.out.println("3. Pasta      - $100.00");
        System.out.println("4. Sandwich   - $70.00");
        System.out.println("5. Milk Tea   - $90.00");

        while (again == 'Y') {

            System.out.print("\nEnter item number: ");
            int item = input.nextInt();

            System.out.print("Enter quantity: ");
            int quantity = input.nextInt();

            // Check item and quantity first
            if (item < 1 || item > 5 || quantity < 1 || quantity > 10) {
                System.out.println("\nInvalid order! Please enter a valid item and quantity.");
                continue;
            }

            System.out.print("Are you a student? (Y/N): ");
            char student = input.next().toUpperCase().charAt(0);

            double price = 0;

            if (item == 1) {
                price = 80;
            }
            else if (item == 2) {
                price = 120;
            }
            else if (item == 3) {
                price = 100;
            }
            else if (item == 4) {
                price = 70;
            }
            else if (item == 5) {
                price = 90;
            }

            double subtotal = price * quantity;
            double deduction = 0;

            if (student == 'Y' && subtotal < 500) {
                deduction = subtotal * 0.10;
            }
            else if (student == 'Y' && subtotal >= 500) {
                deduction = subtotal * 0.15;
            }
            else if (student == 'N' && subtotal >= 500) {
                deduction = subtotal * 0.05;
            }

            double orderTotal = subtotal - deduction;

            System.out.printf("\nSubtotal: $%.2f%n", subtotal);
            System.out.printf("Discount: $%.2f%n", deduction);
            System.out.printf("Order total: $%.2f%n", orderTotal);

            totalQuantity = totalQuantity + quantity;
            totalAmount = totalAmount + subtotal;
            totalDeduction = totalDeduction + deduction;

            System.out.print("\nDo you want to order again? (Y/N): ");
            again = input.next().toUpperCase().charAt(0);
        }

        double finalAmount = totalAmount - totalDeduction;

        System.out.println("\n===== FINAL SUMMARY =====");
        System.out.println("Total quantity of items purchased: " + totalQuantity);
        System.out.printf("Total amount before deductions: $%.2f%n", totalAmount);
        System.out.printf("Total deduction: $%.2f%n", totalDeduction);
        System.out.printf("Final amount to pay: $%.2f%n", finalAmount);

        input.close();
    }
}