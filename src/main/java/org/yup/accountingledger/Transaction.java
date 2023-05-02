package org.yup.accountingledger;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Transaction {
        public LocalDate date;
        public LocalTime time;
        public String description;
        public String vendor;
        public float amount;
        public Transaction(String description, String vendor, float amount){
            this.date = LocalDate.now();
            this.time = LocalTime.now();
            this.description = description;
            this.vendor = vendor;
            this.amount = amount;
        }

    public void addDebit() {

        Scanner input = new Scanner(System.in);
        System.out.println("Note");
        this.description = input.nextLine();

        System.out.println("Vendor Name");
        this.vendor = input.nextLine();

        System.out.println("Amount out");
        this.amount = input.nextFloat();

        new Transaction(description, vendor, amount);

    }

    public void addCredit() {

        Scanner input = new Scanner(System.in);
        System.out.println("Note");
        this.description = input.nextLine();

        System.out.println("Payer Name");
        this.vendor = input.nextLine();

        System.out.println("Amount in");
        this.amount = input.nextFloat();

        new Transaction(description, vendor, amount);

    }

    //Getters and Setters
    public LocalDate getDate() {
        LocalDate date = LocalDate.now();
            return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public LocalTime getTime() {
            LocalTime time = LocalTime.now();
        return time;
    }
    public void setTime(LocalTime time) {
        this.time = time;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getVendor() {
        return vendor;
    }
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }}