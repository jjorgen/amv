package org.nsu.dcis.amv.component.clone;

import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.EqualsVisitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by John on 11/27/2016.
 */
public class CompilationUnitWrapperTest {

    private String FILE_TO_PRINT = "C:/WS_NSU/amv/src/main/java/CH/ifa/draw/contrib/dnd/DNDFigures.java";
    private CompilationUnitWrapper firstCompilationUnitWrapper;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void compareTwoEqualMethods() throws Exception {
        CompilationUnitWrapper firstCompilationUnitWrapper = getCompilationUnitWrapper();
        MethodDeclaration firstMethod = firstCompilationUnitWrapper.getMethodByName("getFigures");

        CompilationUnitWrapper secondCompilationUnitWrapper = getCompilationUnitWrapper();
        MethodDeclaration secondMethod = secondCompilationUnitWrapper.getMethodByName("getFigures");

        boolean equals = EqualsVisitor.equals(firstMethod, secondMethod);
        assertTrue(equals);


        assertEquals(firstMethod, secondMethod);
    }

    public CompilationUnitWrapper getCompilationUnitWrapper() {
        return new CompilationUnitWrapper(FILE_TO_PRINT);
    }
}