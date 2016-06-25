package com.vinku.bankreport.processor;

import org.apache.commons.csv.CSVRecord;

/**
 * Created by vinaykushi on 6/24/16.
 */
public class INGNLRecordMapper implements RecordMapper{

    private TransactionTypeMapper mapper = new INGTransactionTypeMapper();

    @Override
    public TransactionEntry mapReportEntry(CSVRecord record) {
        BasicTransactionEntry entry = new BasicTransactionEntry();

        entry.setType(mapper.getMappedType(record.get("\"Naam / Omschrijving\"")));
        entry.setDetails(record.get("\"Naam / Omschrijving\""));

        return entry;
    }
}
