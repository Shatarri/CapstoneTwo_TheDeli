package com.ps;
import java.util.ArrayList;
import java.util.List;

public class Sandwich extends Order.Sandwich {

        private String size;          // "4", "8", "12"
        private String breadType;      // "white", "wheat", "rye"
        private boolean toasted;
        private List<String> regularToppings = new ArrayList<>();
        private List<String> premiumToppings = new ArrayList<>();

        // Constructor to initialize sandwich properties
        public Sandwich(String size, String breadType, boolean toasted) {
            super();
            this.size = size;
            this.breadType = breadType;
            this.toasted = toasted;
        }

        // Add regular and premium toppings
        public void addRegularTopping(String topping) {
            regularToppings.add(topping);
        }
        public void addPremiumTopping(String topping) {
            premiumToppings.add(topping);
        }

        // Calculate the price based on sandwich size and toppings
        public double getPrice() {
            double price = switch (size) {
                case "4" -> 5.50;
                case "8" -> 7.00;
                case "12" -> 8.50;
                default -> 0.0;
            };
            double premiumToppingCost = premiumToppings.size() * switch (size) {
                case "4" -> 1.00;
                case "8" -> 2.00;
                case "12" -> 3.00;
                default -> 0.0;
            };
            return price + premiumToppingCost;
        }

        @Override
        public String toString() {
            return size + "\" sandwich on " + breadType + (toasted ? ", toasted" : "") + " with toppings: " + regularToppings + " and premium toppings: " + premiumToppings;
        }
    }


