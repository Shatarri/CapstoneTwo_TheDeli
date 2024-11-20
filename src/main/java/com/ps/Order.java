package com.ps;
import java.util.ArrayList;
import java.util.List;

public class Order {


    public class Order {
        private List<Sandwich> sandwiches = new ArrayList<>();
        private List<Drink> drinks = new ArrayList<>();
        private List<Chips> chips = new ArrayList<>();

        // Method to add sandwich, drink, or chips to the order
        public void addSandwich(Sandwich sandwich) {
            sandwiches.add(sandwich);
        }
        public void addDrink(Drink drink) {
            drinks.add(drink);
        }
        public void addChips(Chips chip) {
            chips.add(chip);
        }

        // Calculate total cost
        public double calculateTotal() {
            double total = 0;
            for (Sandwich s : sandwiches) total += s.getPrice();
            for (Drink d : drinks) total += d.getPrice();
            for (Chips c : chips) total += c.getPrice();
            return total;
        }

        // Display order summary
        public void displayOrderSummary() {
            System.out.println("Order Summary:");
            for (Sandwich s : sandwiches) System.out.println(s);
            for (Drink d : drinks) System.out.println(d);
            for (Chips c : chips) System.out.println(c);
            System.out.println("Total: $" + calculateTotal());
        }
    }

}
