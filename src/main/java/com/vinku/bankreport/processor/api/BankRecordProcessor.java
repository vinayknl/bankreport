package com.vinku.bankreport.processor.api;

import java.nio.file.Path;

/**
 * BankRecordProcessor.
 * Handles CSV files to produce a report (CSV). 
 * TODO: java docs
 *
 */
public interface BankRecordProcessor {
    void processRecords(Path sourceCSV, Path outputLocation);
}
