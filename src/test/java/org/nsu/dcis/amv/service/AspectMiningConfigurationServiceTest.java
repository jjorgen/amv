package org.nsu.dcis.amv.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.nsu.dcis.amv.entity.AspectMiningConfigurationEntity;
import org.nsu.dcis.amv.util.enumeration.AspectMiningType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertNotNull;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class AspectMiningConfigurationServiceTest {

    @Autowired
    AspectMiningConfigurationService aspectMiningConfigurationService;

    @Test
    public void getEventTracesConfiguration() throws Exception {
        AspectMiningConfigurationEntity configuration = aspectMiningConfigurationService.getConfiguration(AspectMiningType.EVENT_TRACES);
        System.out.println(configuration);
        assertNotNull(configuration.getAspectMiningType() == AspectMiningType.EVENT_TRACES);
    }
}