package org.nsu.dcis.amv.service.clone;

import org.nsu.dcis.amv.component.clone.AstBuilder;
import org.nsu.dcis.amv.component.clone.AstContext;
import org.nsu.dcis.amv.domain.clone.Ast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Assumptions:
 */
@Service
public class AstContextService {

    @Autowired
    AstBuilder astBuilder;

    @Autowired
    AstContext context;

    private List<Ast> astList;

    public AstContext create(String file) {
        context.initialize(file);
        return context;
    }

    public List<Ast> getAstList(AstContext astContext, String fullFileName) {
        return astList;
    }
}
