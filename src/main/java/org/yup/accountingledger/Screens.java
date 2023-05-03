package org.yup.accountingledger;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Screens {
    public static void homeScreen() {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to your account Ledger.");
        System.out.println("Enter D to record a deposit");
        System.out.println("Enter P to record a payment");
        System.out.println("Enter L to view the ledger");
        System.out.println("Enter X to exit");
        System.out.println("Please enter your selection:");

        switch(input.nextLine()){
            case "D":
                addTransaction(false);
                break;

            case "P":
                addTransaction(true);
                break;

            case "L":;
                //opens the ledger app
            break;

            case  "X":
                System.out.println("Thank you, Goodbye!");
            break;

            default:
                System.out.println("That is not an acceptable selection. Please try again.");

        }
    }

    public static void addTransaction(boolean isDebit) {

        Scanner input = new Scanner(System.in);
        String description;
        String vendor;
        float amount;

        System.out.println("Give me a desc");
        description = input.nextLine();

        System.out.println("vendor");
        vendor = input.nextLine();

        System.out.println("amount");
        amount = input.nextFloat();

        Transaction newDebit = new Transaction(description, vendor, amount);

        if(isDebit) {
            newDebit.amount = newDebit.amount * -1;
        }

        try {
            FileWriter writer = new FileWriter("transactions.csv", true);
            writer.write(newDebit.getDate().toString() + "," + newDebit.getTime().toString() + "," + description + "," + vendor + "," + amount + ",");
            String line = String.format("/n,date: %s, time: %s, description: %s, vendor: %s, amount: %.2f", newDebit.getDate(), newDebit.getTime(), newDebit.description, newDebit.vendor, newDebit.amount);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}