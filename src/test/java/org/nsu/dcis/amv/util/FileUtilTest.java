package org.nsu.dcis.amv.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class FileUtilTest {

    @Autowired
    FileUtil fileUtil;

    @Test
    public void getFileExtension() throws Exception {
    }

    @Test
    public void getFileLineList() throws Exception {

    }

}