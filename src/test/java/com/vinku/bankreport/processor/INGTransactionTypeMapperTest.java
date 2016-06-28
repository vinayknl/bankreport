package com.vinku.bankreport.processor;

import com.vinku.bankreport.processor.api.TransactionType;
import com.vinku.bankreport.processor.ing.INGTransactionTypeMapper;
import org.junit.Test;

import java.util.Map;

/**
 * Created by vinaykushi on 6/25/16.
 */
public class INGTransactionTypeMapperTest {

    @Test
    public void loadMappingTest() {
        INGTransactionTypeMapper mapper = new INGTransactionTypeMapper();

        Map<String, TransactionType> allMappedType = mapper.getAllMappedType();

        System.out.println(allMappedType);
        System.out.println(allMappedType.keySet());
    }
}
