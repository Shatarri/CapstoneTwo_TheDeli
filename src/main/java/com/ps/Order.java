package com.ps;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Sandwich> sandwiches = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private List<Chips> chips = new ArrayList<>();

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public List<Chips> getChips() {
        return chips;
    }
    public double calculateTotal() {
        double total = 0;
        for (Sandwich s : sandwiches) total += s.getPrice();
        for (Drink d : drinks) total += d.getPrice();
        for (Chips c : chips) total += c.getPrice();
        return total;
    }

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void addChips(Chips chips) {
        this.chips.add(chips);
    }

    // Displays the order summary
    public void displayOrderSummary() {
        System.out.println("Order Summary:");
        for (Sandwich s : sandwiches) System.out.println(s);
        for (Drink d : drinks) System.out.println(d);
        for (Chips c : chips) System.out.println(c);
        System.out.println("Total: $" + calculateTotal());
    }

    // Sandwich class
    public static class Sandwich {
        private String size;
        private String breadType;
        private double price;

        public Sandwich(String size, String breadType, double price) {
            this.size = size;
            this.breadType = breadType;
            this.price = price;
        }

        public Sandwich() {

        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return size + " sandwich on " + breadType + " bread - $" + price;
        }
    }

    // Drink class
    public static class Drink {
        private String size;
        private String flavor;
        private double price;

        public Drink(String size, String flavor, double price) {
            this.size = size;
            this.flavor = flavor;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return size + " " + flavor + " - $" + String.format("%.2f", price);
        }
    }

    // Chips class (for completeness)
    public static class Chips {
        private String flavor;
        private double price;

        public Chips(String flavor, double price) {
            this.flavor = flavor;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return flavor + " chips - $" + String.format("%.2f", price);
        }
    }
}

