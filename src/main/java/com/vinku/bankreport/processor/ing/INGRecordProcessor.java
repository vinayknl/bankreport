package com.vinku.bankreport.processor.ing;

import com.vinku.bankreport.processor.common.BankReportReader;
import com.vinku.bankreport.processor.api.BankRecordProcessor;
import com.vinku.bankreport.processor.api.RecordMapper;
import com.vinku.bankreport.processor.api.TransactionEntry;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

/**
 * INGRecordProcessor.
 * ING NL implementation of Record processor
 * TODO: move to separate module, java docs
 */
public class INGRecordProcessor implements BankRecordProcessor {

    private BankReportReader reader;
    private RecordMapper mapper;

    public INGRecordProcessor() {
        this.reader = new BankReportReader();
        this.mapper = new INGNLRecordMapper();

    }

    @Override
    public void processRecords(Path sourceCSV, Path outputLocation) {
        try {
            // Read the contents of the file
            Optional<List<CSVRecord>> csvRecords = reader.processRawCSV(sourceCSV);

            if (csvRecords.isPresent()) {
                List<TransactionEntry> processedData = csvRecords.get()
                        .stream()
                        .map(mapper::mapReportEntry)
                        .collect(toList());

                // TODO: Implement writing report

            } else {
                // Log error
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

