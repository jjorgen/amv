package org.nsu.dcis.amv.service.clone;

import org.apache.log4j.Logger;
import org.nsu.dcis.amv.domain.clone.Ast;
import org.nsu.dcis.amv.domain.CloneDetectionResults;
import org.nsu.dcis.amv.domain.clone.MethodAst;
import org.nsu.dcis.amv.util.PdgWrapper;
import org.nsu.dcis.amv.util.PdgScanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloneDetectionService {

    @Autowired
    AstService astService;

    @Autowired
    PdgScanner pdgScanner;

    @Autowired
    AstCreateService astCreateService;

    private Logger log = Logger.getLogger(getClass().getName());

    public PdgWrapper findClones() {
        return new PdgWrapper();
    }

    public CloneDetectionResults mine() {

        List<MethodAst> allMethodAstList = astCreateService.getMethodAstList();
        return null;
    }

//        List<Ast> astList = astService.getAstList();
}
