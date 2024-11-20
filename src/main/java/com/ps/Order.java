package com.ps;

public class Order {
    public com.ps.Sandwich[] getSandwiches() {
        return new com.ps.Sandwich[0];
    }

    public Drink[] getDrinks() {
        return new Drink[0];
    }

    public Chips[] getChips() {
        return new Chips[0];
    }

    public String calculateTotal() {
        return "";
    }

    public void addSandwich(com.ps.Sandwich sandwich) {
    }

    public void addDrink(Drink drink) {
    }

    public void addChips(Chips chips) {
    }

    public void displayOrderSummary() {
    }

    public class Sandwich {
        private String size;
        private String breadType;
        private double price;

        public Sandwich(String size, String breadType, double price) {
            this.size = size;
            this.breadType = breadType;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return size + " sandwich on " + breadType + " bread - $" + price;
        }
    }
    public static class Drink {
        private String size;
        private String flavor;
        private double price;

        public Drink(String size, String flavor) {
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
}

