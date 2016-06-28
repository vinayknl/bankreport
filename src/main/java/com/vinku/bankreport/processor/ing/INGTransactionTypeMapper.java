package com.vinku.bankreport.processor.ing;

import com.vinku.bankreport.processor.common.BasicTransactionType;
import com.vinku.bankreport.processor.api.TransactionType;
import com.vinku.bankreport.processor.api.TransactionTypeMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import static com.vinku.bankreport.processor.common.BasicTransactionType.*;
import static java.util.Objects.requireNonNull;

/**
 * Created by vinaykushi on 6/24/16.
 */
public class INGTransactionTypeMapper implements TransactionTypeMapper {

    private SortedMap<String, TransactionType> detailsToTransactionTypeMap = new TreeMap<>();
    private static final String MAPPING_PROPERTIES_FILE = "ing.properties";

    public INGTransactionTypeMapper() {
        initTypeMap();
    }

    private void initTypeMap() {
        try(InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(MAPPING_PROPERTIES_FILE)) {
            Properties properties = new Properties();
            properties.load(inputStream);
            Arrays.asList(BasicTransactionType.values()).stream().forEach(e -> loadTransactionMap(e, properties));

        } catch (IOException e) {
            throw new RuntimeException("Error loading mapping file", e);
        }
    }

    private void loadTransactionMap(BasicTransactionType type, Properties properties) {
        String allValues = requireNonNull(properties.getProperty(type.name()));

        Arrays.stream(allValues.split(",")).
                forEach(e -> detailsToTransactionTypeMap.put(e.toLowerCase().trim(), type));
    }
    @Override
    public TransactionType getMappedType(String transactionDetail) {
        Optional<String> matchingKey = this.detailsToTransactionTypeMap.keySet().parallelStream().filter(e -> transactionDetail.toLowerCase().contains(e)).findAny();
transactionDetail.toLowerCase().contains(this.detailsToTransactionTypeMap.get("albert heijn"))
        if(matchingKey.isPresent()) {
            return this.detailsToTransactionTypeMap.get(matchingKey.get());
        }
        return UNKNOWN;
    }

    public Map<String, TransactionType> getAllMappedType(){
        return this.detailsToTransactionTypeMap;
    }

}
