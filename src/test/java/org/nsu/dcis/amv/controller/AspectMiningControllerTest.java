package org.nsu.dcis.amv.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class AspectMiningControllerTest {

    @Autowired
    AspectMiningController aspectMiningController;

    @Test
    public void mineForAspectsSuccessfully() throws Exception {
        aspectMiningController.mine();
    }
}
