package com.vinku.bankreport.processor.api;

import org.apache.commons.csv.CSVRecord;

/**
 * RecordMapper.
 * Provide API's for mapping a raw CSV record to Transaction.
 */
public interface RecordMapper {

    TransactionEntry mapReportEntry(CSVRecord record);
}
