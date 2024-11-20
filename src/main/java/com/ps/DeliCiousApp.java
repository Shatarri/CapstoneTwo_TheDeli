package com.ps;
import java.util.Scanner;

public class DeliCiousApp {
        public static void start() {
            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            while (running) {
                System.out.println("Welcome to DELI-cious! Please select an option:");
                System.out.println("1) New Order");
                System.out.println("0) Exit");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Clear input buffer
                switch (choice) {
                    case 1 -> startNewOrder(scanner);
                    case 0 -> {
                        System.out.println("Thank you for using DELI-cious! Goodbye.");
                        running = false;
                    }
                    default -> System.out.println("Invalid option. Please try again.");
                }
            }
            scanner.close();
        }

        // Start a new order
        private static void startNewOrder(Scanner scanner) {
            Order order = new Order();
            boolean ordering = true;

            while (ordering) {
                System.out.println("Order Menu:");
                System.out.println("1) Add Sandwich");
                System.out.println("2) Add Drink");
                System.out.println("3) Add Chips");
                System.out.println("4) Checkout");
                System.out.println("0) Cancel Order");

                int option = scanner.nextInt();
                scanner.nextLine(); // Clear input buffer
                switch (option) {
                    case 1 -> order.addSandwich(createSandwich(scanner));  // Add a sandwich to the order
                    case 2 -> order.addDrink(createDrink(scanner));        // Add a drink to the order
                    case 3 -> order.addChips(createChips(scanner));        // Add chips to the order
                    case 4 -> {
                        order.displayOrderSummary();
                        System.out.println("Confirm order? (y/n)");
                        if (scanner.nextLine().equalsIgnoreCase("y")) {
                            ReceiptManager.saveReceipt(order);
                            System.out.println("Order saved. Returning to main menu.");
                            ordering = false;
                        }
                    }
                    case 0 -> {
                        System.out.println("Order canceled. Returning to main menu.");
                        ordering = false;
                    }
                    default -> System.out.println("Invalid option. Please try again.");
                }
            }
        }

        // Placeholder methods to create each item
        private static Sandwich createSandwich(Scanner scanner) {
            System.out.println("Enter sandwich size (4, 8, 12): ");
            String size = scanner.nextLine();

            return new Sandwich(size, "white", false);
        }

        private static Order.Drink createDrink(Scanner scanner) {
            return new Order.Drink("Small", "Cola");
        }

        private static <Chips> Chips createChips(Scanner scanner) {
            return new Chips("Original");
        }
    }

}
