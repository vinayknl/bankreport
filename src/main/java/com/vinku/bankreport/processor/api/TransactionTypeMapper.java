package com.vinku.bankreport.processor.api;

/**
 * TransactionTypeMapper.
 * Provide API's for Type Mapping from transaction details or meta data about transaction.
 * TODO: java docs
 */
public interface TransactionTypeMapper {

    TransactionType getMappedType(String transactionDetail);
}
