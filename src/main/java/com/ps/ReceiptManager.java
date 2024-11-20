package com.ps;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ReceiptManager {

    public static void saveReceipt(Order order) {
        String filename = new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date()) + ".txt";
        try (FileWriter writer = new FileWriter("receipts/" + filename)) {
            writer.write("DELI-cious Order Receipt\n");
            writer.write("========================\n");
            for (Order.Sandwich s : order.getSandwiches()) writer.write(s.toString() + "\n");
            for (Order.Drink d : order.getDrinks()) writer.write(d.toString() + "\n");  // Corrected here
            for (Order.Chips c : order.getChips()) writer.write(c.toString() + "\n");
            writer.write("Total: $" + order.calculateTotal() + "\n");
        } catch (IOException e) {
            System.out.println("Error saving receipt: " + e.getMessage());
        }
    }
}
