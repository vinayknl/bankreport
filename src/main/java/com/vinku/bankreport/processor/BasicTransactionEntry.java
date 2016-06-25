package com.vinku.bankreport.processor;

import java.util.Date;

/**
 * Created by vinaykushi on 6/22/16.
 */
public class BasicTransactionEntry implements TransactionEntry{

    private Date date;
    private String details;
    private String accountId;
    private double amount;
    private String notes;
    private TransactionType transactionType;

    @Override
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public TransactionType getType() {
        return transactionType;
    }

    public void setType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public String toString() {
        return "BasicTransactionEntry{" +
                "date=" + date +
                ", details='" + details + '\'' +
                ", accountId='" + accountId + '\'' +
                ", amount=" + amount +
                ", notes='" + notes + '\'' +
                ", transactionType=" + transactionType +
                '}';
    }
}
