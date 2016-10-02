package org.nsu.dcis.amv.service;

import org.nsu.dcis.amv.domain.Ast;
import org.nsu.dcis.amv.util.FileScanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AstService {

    @Autowired
    FileScanner fileScanner;

    public List<Ast> getAstList() {
        List<Ast> astList = new ArrayList<Ast>();
        List<String> fileList = fileScanner.scan();

        return astList;
    }
}
