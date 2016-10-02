package org.nsu.dcis.amv.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import static org.junit.Assert.*;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class PdgScannerTest {

    @Autowired
    AmvClientConfiguration amvClientConfiguration;

    @Autowired
    PdgScanner pdgScanner;
    private Object excludedDirectoryList;

    @Test
    public void successfullyScanForClonesTest() throws Exception {
        String rootDirectory = null;

        PdgWrapper pdgWrapper = pdgScanner.scan(amvClientConfiguration.getJhotdrawSourceRoot(), getExcludedDirectoryList());
        assertNotNull(pdgWrapper);
    }

    public List<String> getExcludedDirectoryList() {
        String jhotdrawExcludedDirectoryList = amvClientConfiguration.getJhotdrawExcludedDirectoryList();
        StringTokenizer st = new StringTokenizer(jhotdrawExcludedDirectoryList, ",");
        List<String> excludedDirectoryList = new ArrayList<>();
        while(st.hasMoreElements()) {
            excludedDirectoryList.add(((String)st.nextElement()).toUpperCase());
        }
        return excludedDirectoryList;
    }
}