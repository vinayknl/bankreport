package com.vinku.bankreport.processor;

import java.util.Date;

/**
 * Created by vinaykushi on 6/22/16.
 */
public interface TransactionEntry {

    Date getDate();
    String getDetails();
    String getAccountId();
    double getAmount();
    String getNotes();
    TransactionType getType();

}
