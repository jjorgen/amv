package org.nsu.dcis.amv.util;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class FileScannerTest {

    @Autowired
    FileScanner fileScanner;

    private Logger log = Logger.getLogger(getClass().getName());

    @Test
    public void successfullyRetrievingAllRelevantFiles() throws Exception {
        List<String> fileList = fileScanner.scan();
        log.info(fileList);

    }
}