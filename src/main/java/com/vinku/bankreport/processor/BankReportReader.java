package com.vinku.bankreport.processor;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

/**
 * BankReportReader.
 */
public class BankReportReader {
    private static final Logger LOG = LoggerFactory.getLogger(BankReportReader.class);


    public Optional<List<CSVRecord>> processRawCSV(Path filePath) throws FileNotFoundException {
        try(Reader in = new FileReader(filePath.toFile())) {
            return Optional.of(CSVFormat.EXCEL.withFirstRecordAsHeader().withQuote(null).parse(in).getRecords());
        } catch (IOException e) {
            LOG.error("Error Processing Raw File", e);
            return Optional.empty();
        }
    }
}
