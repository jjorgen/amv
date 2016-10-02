package org.nsu.dcis.amv.controller;

import org.nsu.dcis.amv.domain.AspectMiningResults;
import org.nsu.dcis.amv.domain.ClusteringResults;
import org.nsu.dcis.amv.domain.EventTracesResults;
import org.nsu.dcis.amv.service.CloneDetectionService;
import org.nsu.dcis.amv.service.ClusteringService;
import org.nsu.dcis.amv.service.EventTracesService;
import org.nsu.dcis.amv.domain.CloneDetectionResults;
import org.nsu.dcis.amv.service.SynthesizingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AspectMiningController {

    @Autowired
    CloneDetectionService cloneDetectionService;

    @Autowired
    EventTracesService eventTracesService;

    @Autowired
    ClusteringService clusteringService;

    @Autowired
    SynthesizingService synthesizingService;

    public void mine() {

        CloneDetectionResults cloneDetectionResults = cloneDetectionService.mine();
        EventTracesResults eventTracesResults = eventTracesService.mine();
        ClusteringResults clusteringResults = clusteringService.mine();
        AspectMiningResults aspectMiningResults = synthesizingService.synthesize(cloneDetectionResults,
                                                                                 eventTracesResults,
                                                                                 clusteringResults);
        save(aspectMiningResults);
    }

    private void save(AspectMiningResults aspectMiningResults) {
    }
}
