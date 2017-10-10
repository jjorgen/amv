package org.nsu.dcis.amv.util;

import org.springframework.stereotype.Component;

@Component
public class Adder {

    public Integer add(Integer a, Integer b) {
        Integer result;
        result = a + b;
        return result;
    }
}
