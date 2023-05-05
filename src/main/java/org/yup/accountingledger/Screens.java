package org.yup.accountingledger;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Screens {
    public static void homeScreen() {
        boolean appRunning = true;
        while (appRunning) {
            Scanner input = new Scanner(System.in);

            System.out.println("Welcome to LedgerPro Basic");
            System.out.println("Enter D to QuikRecord a deposit");
            System.out.println("Enter P to QuikRecord a payment");
            System.out.println("Enter L to enter your personal ledger");
            System.out.println("Enter X to close LedgerPro Basic");
            System.out.println("Please enter your selection:");

            switch (input.nextLine().toUpperCase()) {
                case "D":
                    addTransaction(false);
                    break;

                case "P":
                    addTransaction(true);
                    break;

                case "L":
                    Ledger.ledger();
                    break;

                case "X":
                    System.out.println("Thank you, Goodbye!");
                    appRunning = false;
                    break;

                default:
                    System.out.println("That is not an acceptable selection. Please try again.");
            }
        }
    }
        public static void addTransaction ( boolean isDebit){

            Scanner input = new Scanner(System.in);
            String description;
            String vendor;
            double amount;

            System.out.println("Memo");
            description = input.nextLine();

            System.out.println("Guarantor");
            vendor = input.nextLine();

            System.out.println("Amount");
            amount = input.nextDouble();

            Transaction nL = new Transaction(description, vendor, amount);

            if (isDebit) {
                nL.amount = nL.amount * -1;
            }

            try {
                FileWriter writer = new FileWriter("transactions.csv", true);
                String line = String.format("%s|%s|%s|%s|%.2f \n", nL.getDate(), nL.getTime(), nL.description, nL.vendor, nL.amount);
                writer.write(line);
                writer.close();

            } catch (IOException e) {
                e.printStackTrace();
        }
    }
}