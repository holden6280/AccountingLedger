package org.yup.accountingledger;
import java.util.Scanner;
public class Screens {
    public static String homeScreen() {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to your account Ledger.");
        System.out.println("Enter D to make a deposit");
        System.out.println("Enter P to make a payment");
        System.out.println("Enter L to view the ledger");
        System.out.println("Enter X to exit");
        System.out.println("Please enter your selection:");

        int amount;
        boolean isDebit;
        String selection = new Transaction("","",);

        switch(selection){
            case "D":
                Transaction;
                break;
            case "P":
                Transaction;
                break;
            case "L": ;
            break;
            case "X":
                System.out.println("Thank you, Goodbye!");
            break;
            default:
                System.out.println("That is not an acceptable selection. Please try again.");;
        }

        return input.nextLine();
        //The home screen should give the user the following options. The application should continue to run until the user chooses to exit.
        // D) Add Deposit - prompt user for the deposit information and save it to the csv file
        // P) Make Payment (Debit) - prompt user for the debit information and save it to the csv file
        // L) Ledger - display the ledger screen
        // X) Exit - exit the application

        //this should contain a system.in switch statement
    }
}