package org.yup.accountingledger;
import java.time.LocalDate;
import java.time.LocalTime;

public class Transaction {
        public LocalDate date;
        public LocalTime time;
        public String description;
        public String vendor;
        public double amount;
        public Transaction(String description, String vendor, double amount){
            this.date = LocalDate.now();
            this.time = LocalTime.now();
            this.description = description;
            this.vendor = vendor;
            this.amount = amount;
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
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
}