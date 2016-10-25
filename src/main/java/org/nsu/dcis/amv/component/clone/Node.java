package org.nsu.dcis.amv.component.clone;

import org.nsu.dcis.amv.util.FileLine;

public abstract class Node {

    FileLine fileLine;

    public Node(FileLine fileLine) {
        this.fileLine = fileLine;
    }

    public FileLine getFileLine() {
        return fileLine;
    }
}
