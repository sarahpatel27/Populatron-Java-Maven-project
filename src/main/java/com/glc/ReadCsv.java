package com.glc;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadCsv {

    private Path filePath;
    
    public void ReadCSV(Path filePath) {
        this.filePath = filePath;
    }
    
    public List<String> readAllLines() throws IOException {
        return Files.readAllLines(filePath, StandardCharsets.ISO_8859_1);
    }

}
