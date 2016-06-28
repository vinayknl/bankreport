package com.vinku.bankreport.processor.ing;

import com.vinku.bankreport.processor.common.BasicTransactionEntry;
import com.vinku.bankreport.processor.api.RecordMapper;
import com.vinku.bankreport.processor.api.TransactionEntry;
import com.vinku.bankreport.processor.api.TransactionTypeMapper;
import org.apache.commons.csv.CSVRecord;

/**
 * INGNLRecordMapper.
 * ING NL bank specific implementation
 * TODO: move to different module.
 */
public class INGNLRecordMapper implements RecordMapper {

    private TransactionTypeMapper mapper = new INGTransactionTypeMapper();

    @Override
    public TransactionEntry mapReportEntry(CSVRecord record) {
        BasicTransactionEntry.BasicTransactionEntryBuilder builder =
                new BasicTransactionEntry.BasicTransactionEntryBuilder();

        // TODO: Add other mapping implementation
        // FIXME : Move file mappings to configuration files

        builder.withTransactionType(mapper.getMappedType(record.get("\"Naam / Omschrijving\"")));
        builder.withDetails(record.get("\"Naam / Omschrijving\""));

        return builder.build();
    }
}
