package org.nsu.dcis.amv.service;

import org.nsu.dcis.amv.data.base.JdbcAspectMiningConfiguration;
import org.nsu.dcis.amv.entity.AspectMiningConfigurationEntity;
import org.nsu.dcis.amv.util.enumeration.AspectMiningType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AspectMiningConfigurationService {

    @Autowired
    JdbcAspectMiningConfiguration jdbcAspectMiningConfiguration;

    public AspectMiningConfigurationEntity getConfiguration(AspectMiningType aspectMiningType) {

        AspectMiningConfigurationEntity aspectMiningConfigurationEntity = jdbcAspectMiningConfiguration.getConfiguration(aspectMiningType);

        return aspectMiningConfigurationEntity;
    }
}
