package org.yup.accountingledger;

public class Debit {
    public int date;

    public int time;

    public String description;

    public String vendor;

    public int amount;

    public Debit(int date, int time, String description, String vendor, int amount) {

        this.date = date;
        this.time = time;
        this.description = description;
        this.vendor = vendor;
        this.amount = amount;

    }
}