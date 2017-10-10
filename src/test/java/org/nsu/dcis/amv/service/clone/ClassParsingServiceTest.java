package org.nsu.dcis.amv.service.clone;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ClassParsingServiceTest {

    @Autowired
    ClassParsingService classParsingService;

    @Test
    public void parseTest() throws Exception {
        String fileName = "";
        classParsingService.parse(fileName);

    }
}