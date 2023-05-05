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

            System.out.println("A - View All Transactions");
            System.out.println("D - View Deposits");
            System.out.println("P - View Payments");
            System.out.println("M - Return to the Main Menu");

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
                                System.out.printf("%s|%s|%s|%s|%.2f\n", split[0], split[1], split[2], split[3], amount);
                            }
                        }
                        emp.close();
                    }
                    catch(IOException e) {

                        System.out.println("CRITICAL ERROR /n Invalid input");
                        throw new RuntimeException(e);

                    }
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

                        System.out.println("CRITICAL ERROR \n Invalid input");
                        throw new RuntimeException(e);

                    }
                    break;
                    
                case "M":
                    appRunning = false;
                    Screens.homeScreen();
                    break;

                default:
                    System.out.println("That is not an acceptable selection. Please try again.");
            }
        }
    }
}