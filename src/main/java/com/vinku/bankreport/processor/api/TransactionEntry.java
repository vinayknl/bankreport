package com.vinku.bankreport.processor.api;

import java.util.Date;

/**
 * TransactionEntry.
 * Representation of a processed Transaction.
 * TODO: Java docs
 */
public interface TransactionEntry {
    
    Date getDate();
    
    void setDate(Date date);
    
    String getDetails();

    void setDetails(String details);

    String getAccountId();

    void setAccountId(String accountId);

    double getAmount();

    void setAmount(double amount);

    String getNotes();

    void setNotes(String notes);

    TransactionType getType();

    void setTransactionType(TransactionType transactionType);
}
