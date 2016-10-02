package org.nsu.dcis.amv.util;

import org.springframework.stereotype.Component;

import java.io.File;

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
}
