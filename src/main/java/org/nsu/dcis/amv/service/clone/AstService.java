package org.nsu.dcis.amv.service.clone;

import org.nsu.dcis.amv.domain.clone.Ast;
import org.nsu.dcis.amv.util.CuPrinter;
import org.nsu.dcis.amv.util.FileScanner;
import org.nsu.dcis.amv.component.clone.AstBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AstService {

    @Autowired
    FileScanner fileScanner;

    @Autowired
    AstContextService astContextService;

    @Autowired
    AstBuilder astBuilder;

    @Autowired
    CuPrinter cuPrinter;

    public List<Ast> getAstList() {
        List<String> fileList = fileScanner.scan();

        for (String fileName : fileList) {
            System.out.println("File Name: " + fileName);
            cuPrinter.printFile(fileName);
        }

        List<Ast> astList = new ArrayList<>();

//        for (String file : fileList) {
//            AstContext astContext = astContextService.create(file);
//            List<Ast> astListFromContext = astContextService.getAstList(astContext, file);
//            astList.addAll(astListFromContext);
//        }

        return astList;
    }
}
