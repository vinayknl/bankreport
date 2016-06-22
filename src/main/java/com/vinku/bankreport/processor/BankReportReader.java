package com.vinku.bankreport.processor;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Path;
import java.util.List;

/**
 * Created by vnarasimhan on 21-6-2016.
 */
public class BankReportReader {
    
    public List<CSVRecord> processRawCSV(Path filePath) throws FileNotFoundException {
        try(Reader in = new FileReader(filePath.toFile())) {
            return CSVFormat.EXCEL.withFirstRecordAsHeader().withQuote(null).parse(in).getRecords();
        } catch (IOException e) {
            e.printStackTrace(); //FIXME
            return null;
        }
    }
}
