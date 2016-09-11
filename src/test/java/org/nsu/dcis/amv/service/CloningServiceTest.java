package org.nsu.dcis.amv.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.nsu.dcis.amv.util.CloneResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertNotNull;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class CloningServiceTest {

    @Autowired
    CloningService cloningService;

    @Test
    public void findClones() throws Exception {
        CloneResult cloneResult = cloningService.findClones();
        assertNotNull(cloneResult);
    }
}
