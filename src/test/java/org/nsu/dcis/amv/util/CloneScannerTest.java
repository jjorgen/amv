package org.nsu.dcis.amv.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class CloneScannerTest {

    @Autowired
    CloneScanner cloneScanner;

    @Test
    public void successfullyScanForClonesTest() throws Exception {
        String rootDirectory = null;

        CloneResult cloneResult = cloneScanner.scan(rootDirectory);
        assertNotNull(cloneResult);
    }
}