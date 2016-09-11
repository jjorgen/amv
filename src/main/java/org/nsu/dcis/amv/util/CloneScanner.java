package org.nsu.dcis.amv.util;

import org.springframework.stereotype.Component;

@Component
public class CloneScanner {

    public CloneResult scan(String rootDirectory) {
        return new CloneResult();
    }
}
