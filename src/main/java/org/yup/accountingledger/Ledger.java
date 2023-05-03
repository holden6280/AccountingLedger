package org.yup.accountingledger;
import java.util.Scanner;
public class Ledger {

    public static void ledger() {
        boolean appRunning = true;
        while (appRunning) {
            Scanner input = new Scanner(System.in);

            System.out.println();
        }
    }
}

/*
Ledger - All entries should show the newest entries first
        o A) All - Display all entries
        o D) Deposits - Display only the entries that are deposits into the account
        o P) Payments - Display only the negative entries (or payments)
        o R) Reports - A new screen that allows the user to run pre-defined reports or to run a custom search
        ▪ 1) Month To Date
        ▪ 2) Previous Month
        ▪ 3) Year To Date
        ▪ 4) Previous Year
        ▪ 5) Search by Vendor - prompt the user for the vendor name and display all entries for that vendor
        ▪ 0) Back - go back to the report page
*/