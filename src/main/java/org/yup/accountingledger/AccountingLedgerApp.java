package org.yup.accountingledger;
import java.util.Scanner;
public class AccountingLedgerApp {

    public static void main(String[] args){

        boolean appRunning = true;

        while (appRunning = true){
            Screens.homeScreen();
        }

        public void ledger() {
            Scanner input = new Scanner(System.in);

            System.out.println("Welcome to your account Ledger.");


    }
}

      /*


            switch(ledgerChoice) {
                case
            }}
        */

        //Ledger - All entries should show the newest entries first
        // A) All - Display all entries
        // D) Deposits - Display only the entries that are deposits into the account
        // P) Payments - Display only the negative entries (or payments)
        // R) Reports - A new screen that allows the user to run pre-defined reports or to run a custom search
        //  1) Month To Date
        //  2) Previous Month
        //  3) Year To Date
        //  4) Previous Year
        //  5) Search by Vendor - prompt the user for the vendor name and display all entries for that vendor
        //  0) Back - go back to the report page
        // H) Home - go back to the home page