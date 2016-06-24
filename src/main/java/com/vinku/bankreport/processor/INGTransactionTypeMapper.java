package com.vinku.bankreport.processor;

import java.util.HashMap;
import java.util.Map;

import static com.vinku.bankreport.processor.BasicTransactionType.*;

/**
 * Created by vinaykushi on 6/24/16.
 */
public class INGTransactionTypeMapper implements TransactionTypeMapper{

    private Map<String, TransactionType> detailsToTransactionTypeMap = new HashMap<>();

    public INGTransactionTypeMapper() {
        initTypeMap();
    }

    private void initTypeMap() {
        // TODO: Move it to properties file

        // Groceries Map
        detailsToTransactionTypeMap.put("ALBERT HEIJN".toLowerCase(), SUBSISTANCE);



    }

    @Override
    public TransactionType getMappedType(String transactionDetail) {
        return null;
    }
}
