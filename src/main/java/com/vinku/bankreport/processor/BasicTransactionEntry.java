package com.vinku.bankreport.processor;

import java.util.Date;

/**
 * Created by vinaykushi on 6/22/16.
 */
public class BasicTransactionEntry implements TransactionEntry{
    @Override
    public Date getDate() {
        return null;
    }

    @Override
    public String getDetail() {
        return null;
    }

    @Override
    public String getAccountId() {
        return null;
    }

    @Override
    public double getAmount() {
        return 0;
    }

    @Override
    public String getNotes() {
        return null;
    }

    @Override
    public TransactionType getType() {
        return null;
    }
}
