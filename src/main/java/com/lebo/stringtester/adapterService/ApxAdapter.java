package com.lebo.stringtester.adapterService;

import com.lebo.stringtester.model.SubClass;
import org.springframework.stereotype.Component;

@Component("APX")
public class ApxAdapter implements  DestionationAapter {

    @Override
public String process(SubClass request){
        return "I took the path APX: " + request.getResults();
    }
}
