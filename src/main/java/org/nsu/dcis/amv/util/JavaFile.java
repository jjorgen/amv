package org.nsu.dcis.amv.util;

import org.apache.log4j.Logger;
import org.nsu.dcis.amv.exception.AspectCloneException;
import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

@Component
public class JavaFile {

    private Logger log = Logger.getLogger(getClass().getName());

    public void read(String absolutePath) {

        FileInputStream fis = null;
        BufferedReader reader = null;
        try {
            fis = new FileInputStream(absolutePath);
            reader = new BufferedReader(new InputStreamReader(fis));

            System.out.println("Reading File line by line using BufferedReader");

            String line = reader.readLine();
            while(line != null){
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (Exception e) {
            throw new AspectCloneException("An error occurred when reading Java source file", e);
        }
    }
}
