package com.vinku.bankreport.processor;

import org.apache.commons.csv.CSVRecord;

/**
 * RecordMapper.
 */
public interface RecordMapper {

    TransactionEntry mapReportEntry(CSVRecord record);
}
