package org.nsu.dcis.amv.component.clone;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.nsu.dcis.amv.util.FileLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class AstContextTest {

    @Autowired
    AstContext astContext;

    private Logger log = Logger.getLogger(getClass().getName());

    @Before
    public void setUp() throws Exception {
        astContext.initialize(getFullFileName());
    }

    @Test
    public void getMethodSignatureNodesSuccessfully() throws Exception {
        List<MethodNode> methodSignatureNodes = astContext.getMethodSignatureNodes();
        for (MethodNode methodNode : methodSignatureNodes) {
            log.info(methodNode.toString());
        }
    }

    //    @Test
//    public void createAstContextSuccessfully() throws Exception {
//        String fullFileName = astContext.getFullFileName();
//        assertNotNull(fullFileName);
//    }
//
//    @Test
//    public void getFileLinesSuccessfully() throws Exception {
//        List<FileLine> fileLines = astContext.getFileLines();
//        assertTrue(fileLines.size() != 0);
//        log.info(astContext.getPackageNode().getFileLine());
//        for (ImportNode importNode : astContext.getImportNodes()) {
//            log.info(importNode.getFileLine());
//        }
//        log.info(astContext.getClassNode().getFileLine());
//        for (MethodNode methodSignatureNode : astContext.getMethodSignatureNodes()) {
//            log.info(methodSignatureNode.getFileLine());
//        }
//    }

    public String getFullFileName() {
        return "C:/WS_NSU/amv/src/main/java/CH/ifa/draw/contrib/dnd/DNDFigures.java";
    }
}