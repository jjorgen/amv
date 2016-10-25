package org.nsu.dcis.amv.component.clone;

import org.nsu.dcis.amv.util.FileLine;
import org.nsu.dcis.amv.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AstContext {

    @Autowired
    FileUtil fileUtil;

    private List<String> fileLineList = new ArrayList<>();

    private ClassNode classNode;
    private List<ImportNode> importNodes = new ArrayList<>();
    private PackageNode packageNode;
    private List<MethodNode> methodSignatureNodes = new ArrayList<>();

    private String fullFileName;
    private List<FileLine> fileLines;
    private String rawFileString;
    private String fileString;

    private AstContext() {
    }

    public void initialize(String fullFileName) {
        this.fullFileName = fullFileName;
        setFileLines();
        extractPackageNode();
        extractImportNodes();
        extractClassNode();
        extractMethodSignatureNodes();
    }

    private void extractMethodSignatureNodes() {
        for (FileLine fileLine : fileLines) {
            if (isMethodSignature(fileLine)) {
                methodSignatureNodes.add(new MethodNode(fileLine));
            }
        }
    }

    private boolean isMethodSignature(FileLine fileLine) {
        String line = new String(fileLine.getString()).trim();
        if (line.indexOf("public") ==  0) {
            int leftParenthesisPos = line.indexOf("(");
            int rightParenthesisPos  = line.indexOf(")");
            if (leftParenthesisPos < rightParenthesisPos) {
                return true;
            }
        }
        return false;
    }

    private void extractPackageNode() {
        for (FileLine fileLine : fileLines) {
            if (fileLine.getString().contains("package ")) {
                this.packageNode = new PackageNode(fileLine);
                break;
            }
        }
    }

    private void extractClassNode() {
        for (FileLine fileLine : fileLines) {
            if (fileLine.getString().contains("class ")) {
                this.classNode = new ClassNode(fileLine);
                break;
            }
        }
    }

    private void extractImportNodes() {
        for (FileLine fileLine : fileLines) {
            if (fileLine.getString().contains("import ")) {
                importNodes.add(new ImportNode(fileLine));
            }
        }
    }

    private void setFileLines() {
        fileLines = fileUtil.getFileLines(fullFileName);
        createRawFileString();
        createFileString();
    }

    private void createRawFileString() {
        StringBuilder fileStringBuilder = new StringBuilder();
        for (FileLine fileLine : fileLines) {
            fileStringBuilder.append(fileLine.getString());
        }
        rawFileString = fileStringBuilder.toString();
    }

    private void createFileString() {
        StringBuilder fileStringBuilder = new StringBuilder();
        for (FileLine fileLine : fileLines) {
            String line = fileLine.getString();
            line = removeInlineComment(line);
            fileStringBuilder.append(line);
        }
        fileString = fileStringBuilder.toString();
    }

    private String removeInlineComment(String line) {
        int inlineCommentLinePos = line.indexOf("//");
        if (inlineCommentLinePos != -1) {
            line = line.substring(0, inlineCommentLinePos);
        }
        return line;
    }

    public String getFullFileName() {
        return fullFileName;
    }

    public List<FileLine> getFileLines() {
        return fileLines;
    }

    public String getRawFileString() {
        return rawFileString;
    }

    public String getFileString() {
        return fileString;
    }

    public FileUtil getFileUtil() {
        return fileUtil;
    }

    public void setFileUtil(FileUtil fileUtil) {
        this.fileUtil = fileUtil;
    }

    public List<String> getFileLineList() {
        return fileLineList;
    }

    public void setFileLineList(List<String> fileLineList) {
        this.fileLineList = fileLineList;
    }

    public ClassNode getClassNode() {
        return classNode;
    }

    public void extractClassNode(ClassNode classNode) {
        this.classNode = classNode;
    }

    public List<ImportNode> getImportNodes() {
        return importNodes;
    }

    public void extractImportNodes(List<ImportNode> importNodes) {
        this.importNodes = importNodes;
    }

    public PackageNode getPackageNode() {
        return packageNode;
    }

    public void extractPackageNode(PackageNode packageNode) {
        this.packageNode = packageNode;
    }

    public void setFullFileName(String fullFileName) {
        this.fullFileName = fullFileName;
    }

    public void setFileLines(List<FileLine> fileLines) {
        this.fileLines = fileLines;
    }

    public void setRawFileString(String rawFileString) {
        this.rawFileString = rawFileString;
    }

    public void setFileString(String fileString) {
        this.fileString = fileString;
    }

    public List<MethodNode> getMethodSignatureNodes() {
        return methodSignatureNodes;
    }
}
