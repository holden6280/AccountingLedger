package org.yup.accountingledger;

import java.time.LocalDate;
import java.time.LocalTime;

public class Transaction {
        public LocalDate date;

        public LocalTime time;

        public String description;

        public String vendor;

        public int amount;

        public boolean isDebit;

        public Transaction(String description, String vendor, int amount, boolean isDebit){

            this.date = LocalDate.now();
            this.time = LocalTime.now();
            this.description = description;
            this.vendor = vendor;
            this.amount = amount;
            this.isDebit = isDebit;
        }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isDebit() {
        return isDebit;
    }

    public void setDebit(boolean debit) {
        isDebit = debit;
    }
}