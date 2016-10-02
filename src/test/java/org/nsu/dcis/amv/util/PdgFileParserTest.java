package org.nsu.dcis.amv.util;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PdgFileParserTest {

    @Autowired
    PdgFileParser pdgFileParser;

    @Test
    public void getPdgs() throws Exception {
        String absolutePath = null;
        PdgWrapper pdgWrapper = new PdgWrapper();
        pdgFileParser.getPdgs(absolutePath, pdgWrapper);
        pdgWrapper.getPdgs();
    }
}