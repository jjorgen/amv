package org.nsu.dcis.amv.util;

import org.nsu.dcis.amv.exception.AmvException;
import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Component
public class FileUtil {

    public String getFileExtension(File file) {
        String name = file.getName();
        try {
            return name.substring(name.lastIndexOf(".") + 1);
        } catch (Exception e) {
            return "";
        }
    }

    public List<FileLine> getFileLines(String fullFileName) {

        FileInputStream fis;
        BufferedReader reader;

        List<FileLine> fileLines = new ArrayList<>();
        try {
            fis = new FileInputStream(fullFileName);
            reader = new BufferedReader(new InputStreamReader(fis));
            String line = reader.readLine();
            int lineNumber = 0;
            while(line != null){
                FileLine fileLine = new FileLine(line);
                fileLine.setLineNumber(++lineNumber);
                fileLines.add(fileLine);
                line = reader.readLine();
            }
        } catch (Exception e) {
            throw new AmvException("Unable to read lines from '" + fullFileName + "'", e);
        }
        return fileLines;
    }
}
