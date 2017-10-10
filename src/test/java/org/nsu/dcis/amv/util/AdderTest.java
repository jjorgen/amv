package org.nsu.dcis.amv.util;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AdderTest {

    @Autowired
    Adder adder;

    private Logger log = Logger.getLogger(getClass().getName());

    @Test
    public void addTwoNumbers() throws Exception {
        Integer result;
        result = adder.add(1, 2);
        log.info(result);
    }
}
