package com.vinku.bankreport.processor;

import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by vinaykushi on 6/25/16.
 */
public class INGRecordProcessor {
    public static void main(String[] args) throws FileNotFoundException {
        String recordFilePath = "/Users/vinaykushi/Downloads/NL53INGB0674666755_12-05-2016_18-06-2016.csv";

        BankReportReader reader = new BankReportReader();
        RecordMapper mapper = new INGNLRecordMapper();

        Optional<List<CSVRecord>> csvRecords = reader.processRawCSV(Paths.get(recordFilePath));

        if (csvRecords.isPresent()) {
            List<TransactionEntry> processedData = csvRecords.get().stream().map(mapper::mapReportEntry).collect(Collectors.toList());
            processedData.forEach(System.out::println);
        }

    }

}

