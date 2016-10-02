package org.nsu.dcis.amv.service;

import org.apache.log4j.Logger;
import org.nsu.dcis.amv.domain.CloneDetectionResults;
import org.nsu.dcis.amv.util.PdgWrapper;
import org.nsu.dcis.amv.util.PdgScanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CloneDetectionService {

    @Autowired
    AstService astService;

    @Autowired
    PdgScanner pdgScanner;

    private Logger log = Logger.getLogger(getClass().getName());

    public PdgWrapper findClones() {
        return new PdgWrapper();
    }

    public CloneDetectionResults mine() {
        log.info("Mine using clone detection.");

        astService.getAstList();
        return null;
    }
}
