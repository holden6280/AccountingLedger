package org.yup.accountingledger;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Ledger {

    public static void ledger() {
        boolean appRunning = true;
        while (appRunning) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter R to view Pre-Defined Reports or run a custom search");
            System.out.println("Filter by: D - Deposits, P - Payments");

            switch (input.nextLine().toUpperCase()) {
                case "A":
                    try {

                        BufferedReader emp = new BufferedReader(new FileReader("transactions.csv"));

                        String line;
                        while ((line = emp.readLine()) != null) {

                            String[] split = line.split("\\|");
                            System.out.printf("%s|%s|%s|%s|%.2f \n", split[0], split[1], split[2], split[3], Double.parseDouble(split[4]));

                        }
                        emp.close();
                    }
                    catch(IOException e) {

                        System.out.println("CRITICAL ERROR /n Invalid input");
                        throw new RuntimeException(e);

                    }

                break;
                case "D":

                    try {

                        BufferedReader emp = new BufferedReader(new FileReader("transactions.csv"));

                        String line;
                        while ((line = emp.readLine()) != null) {

                            String[] split = line.split("\\|");
                            Double amount = Double.parseDouble(split[4]);

                            if (amount > 0) {
                                System.out.printf("%s|%s|%s|%s|%.2f \n", split[0], split[1], split[2], split[3], amount);
                            }
                        }
                        emp.close();
                    }
                    catch(IOException e) {

                        System.out.println("CRITICAL ERROR /n Invalid input");
                        throw new RuntimeException(e);

                    }

                    //show only deposits
                break;
                case "P":
                    try {

                        BufferedReader emp = new BufferedReader(new FileReader("transactions.csv"));

                        String line;
                        while ((line = emp.readLine()) != null) {

                            String[] split = line.split("\\|");
                            Double amount = Double.parseDouble(split[4]);

                            if (amount < 0) {
                                System.out.printf("%s|%s|%s|%s|%.2f \n", split[0], split[1], split[2], split[3], amount);
                            }
                        }
                        emp.close();
                    }
                    catch(IOException e) {

                        System.out.println("CRITICAL ERROR /n Invalid input");
                        throw new RuntimeException(e);

                    }
                    break;
                case "R":
                break;
                case "X":
                    System.out.println("Thank you, Goodbye!");
                    appRunning = false;
                break;
                case "M":
                    Screens.homeScreen();
                    break;
                default:
                    System.out.println("That is not an acceptable selection. Please try again.");
            }
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