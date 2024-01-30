package evaluator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CsvParser {
    private final File file;
    private final CsvSeparator separator;

    public CsvParser(File file, CsvSeparator separator) {
        this.file = file;
        this.separator = separator;
    }

    List<List<String>> parse() throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        List<List<String>> stringList = new ArrayList<>();
        while (scanner.hasNextLine()){
            List<String> split = List.of(
                    scanner.nextLine().split(String.valueOf(separator.getCsvSeparator()))
            );
            stringList.add(split);
        }
        scanner.close();
        return stringList;
    }
}
