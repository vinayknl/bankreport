package com.vinku.bankreport.processor;

/**
 * Created by vinaykushi on 6/24/16.
 */
public interface TransactionTypeMapper {

    TransactionType getMappedType(String transactionDetail);
}
