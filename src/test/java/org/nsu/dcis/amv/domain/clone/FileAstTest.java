package org.nsu.dcis.amv.domain.clone;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class FileAstTest {

    private Logger log = Logger.getLogger(getClass().getName());

    private FileAst fileAst;
    private String fileName = "C:/WS_NSU/amv/src/main/java/CH/ifa/draw/contrib/dnd/DNDFigures.java";

//    DNDHelper.java

    @Before
    public void setUp() throws Exception {
        fileAst = new FileAst(fileName);
    }

//    @Test
//    public void getStringifiedAst() throws Exception {
//        String stringifiedAst = fileAst.getStringifiedAst();
//        log.info(stringifiedAst);
//    }

//    @Test
//    public void getMethodAstList() throws Exception {
//        fileAst.getMethodAstList();
//    }


    @Test
    public void traverseNodeHierarchyTest() throws Exception {
        fileAst.exploreNodeHierarchy();
    }
}