package org.nsu.dcis.amv.component.clone;

import org.apache.log4j.Logger;
import org.nsu.dcis.amv.util.FileLine;

public class MethodNode extends Node {
    private Logger log = Logger.getLogger(getClass().getName());
    private Signature signature;

    public MethodNode(FileLine fileLine) {
        super(fileLine);
        signature = new Signature(fileLine);
    }

    @Override
    public String toString() {
        return "MethodNode{" +
                "signature=" + signature +
                '}';
    }
}
