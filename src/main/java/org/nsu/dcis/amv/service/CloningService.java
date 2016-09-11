package org.nsu.dcis.amv.service;

import org.nsu.dcis.amv.util.CloneResult;
import org.nsu.dcis.amv.util.CloneScanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CloningService {

    @Autowired
    CloneScanner cloneScanner;

    public CloneResult findClones() {
        return new CloneResult();
    }
}
