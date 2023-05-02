package org.yup.accountingledger;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
public class Screens {
    public static String homeScreen() {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to your account Ledger.");
        System.out.println("Enter D to make a deposit");
        System.out.println("Enter P to make a payment");
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

        return input.nextLine();
        //The home screen should give the user the following options. The application should continue to run until the user chooses to exit.
        // D) Add Deposit - prompt user for the deposit information and save it to the csv file
        // P) Make Payment (Debit) - prompt user for the debit information and save it to the csv file
        // L) Ledger - display the ledger screen
        // X) Exit - exit the application

        //this should contain a system.in switch statement
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
            FileWriter writer = new FileWriter("transactions.csv");
            writer.write(newDebit.getDate().toString() + "," + newDebit.getTime().toString() + "," + description + "," + vendor + "," + amount + ",");
            String line = String.format("date: %s, time: %s, description: %s, vendor: %s, amount: %.2f", newDebit.getDate(), newDebit.getTime(), newDebit.description, newDebit.vendor, newDebit.amount);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}