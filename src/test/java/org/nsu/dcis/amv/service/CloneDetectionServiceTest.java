package org.nsu.dcis.amv.service;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.nsu.dcis.amv.util.PdgWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertNotNull;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class CloneDetectionServiceTest {

    @Autowired
    CloneDetectionService cloneDetectionService;

    @Ignore
    @Test
    public void findClones() throws Exception {
        PdgWrapper pdgWrapper = cloneDetectionService.findClones();
        assertNotNull(pdgWrapper);
    }

    @Test
    public void successfullyMineForAspectsUsingCloneDetection() throws Exception {
        cloneDetectionService.mine();

    }
}
