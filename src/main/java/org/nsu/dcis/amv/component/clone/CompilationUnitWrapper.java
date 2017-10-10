package org.nsu.dcis.amv.component.clone;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import org.nsu.dcis.amv.exception.AspectCloneException;

import java.io.FileInputStream;
import java.util.List;

public class CompilationUnitWrapper {

    private CompilationUnit compilationUnit;

    public CompilationUnitWrapper(String fileName) {
        try {
        FileInputStream in = new FileInputStream("C:/WS_NSU/amv/src/main/java/CH/ifa/draw/contrib/dnd/DNDFigures.java");
           compilationUnit = JavaParser.parse(in);
           in.close();
        } catch(Exception e)  {
            throw new AspectCloneException("Unable to read file '" + fileName + "' as a stream", e);
        }
    }

    public CompilationUnit getCompilationUnit() {
        return compilationUnit;
    }

    public MethodDeclaration getMethodByName(String methodName) {
        List<MethodDeclaration> methodDeclarations = compilationUnit.getNodesByType(MethodDeclaration.class);
        for (MethodDeclaration methodDeclaration : methodDeclarations) {
            if (methodDeclaration.getName().equals(methodName)) {
                return methodDeclaration;
            }
        }
        return null;

    }
}
