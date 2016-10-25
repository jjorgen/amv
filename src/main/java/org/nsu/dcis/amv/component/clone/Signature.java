package org.nsu.dcis.amv.component.clone;

import org.apache.log4j.Logger;
import org.nsu.dcis.amv.exception.AspectCloneException;
import org.nsu.dcis.amv.util.FileLine;
import org.nsu.dcis.amv.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Signature {
    private static final int PUBLIC_TOKEN_LENGTH = 6;
    private String methodName;
    private List<Pair<String, String>> parameters = new ArrayList<>();

    private Logger log = Logger.getLogger(getClass().getName());

    Signature(FileLine fileLine) {
        extractMethodName(fileLine);
        extractMethodSignature(fileLine);
    }

    private void extractMethodName(FileLine fileLine) {
        String signatureString = fileLine.getString();
        int publicPos = signatureString.indexOf("public");

        if (publicPos != -1) {
            signatureString = signatureString.substring(publicPos + PUBLIC_TOKEN_LENGTH, signatureString.length() - 1).trim();
            int methodNameEndPos = signatureString.indexOf("(");
            this.methodName = signatureString.substring(0, methodNameEndPos);
        }
    }

    private void extractMethodSignature(FileLine fileLine) {
        String signatureString = fileLine.getString();
        int publicPos = signatureString.indexOf("public");

        if (publicPos != -1) {
            signatureString = signatureString.substring(publicPos + PUBLIC_TOKEN_LENGTH, signatureString.length() - 1).trim();
            int methodNameEndPos = signatureString.indexOf("(");
            this.methodName = signatureString.substring(0, methodNameEndPos);

            String parameterSubstring = signatureString.substring(methodNameEndPos + 1, signatureString.length() - 1).trim();
            if (parameterSubstring.length() > 3) {
                StringTokenizer tokens = new StringTokenizer(parameterSubstring, ",");
                while (tokens.hasMoreElements()) {
                    String token = tokens.nextToken().trim();
                    int parameterIndex = token.indexOf(" ");
                    String parameterName = token.substring(0, parameterIndex).trim();
                    String parameterValue = token.substring(parameterIndex, token.length()).trim();
                    parameters.add(new Pair<>(parameterName, parameterValue));
                }
            }

        } else {
            throw new AspectCloneException("This is not a method signature line: " + signatureString);
        }
    }

    @Override
    public String toString() {
        return "Signature{" +
                "methodName='" + methodName + '\'' +
                ", parameters=" + parameters +
                '}';
    }
}
