package org.nsu.dcis.amv.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AstServiceTest {

    @Autowired
    AstService astService;

    @Test
    public void getAstList() throws Exception {
        astService.getAstList();
    }

}