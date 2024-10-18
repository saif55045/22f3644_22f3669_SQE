package Utilities;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class CSVUtil {

    public static List<String[]> readCSVData(String filePath) throws IOException {
        List<String[]> data = new ArrayList<>();

        // Open the CSV file and parse it
        try (Reader reader = Files.newBufferedReader(Paths.get(filePath))) {
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader());
            
            for (CSVRecord record : csvParser) {
                data.add(new String[]{record.get("Username"), record.get("Password")});
            }
        }

        return data;
    }
}
