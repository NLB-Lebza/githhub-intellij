package com.lebo.stringtester.adapterService;

import com.lebo.stringtester.model.SubClass;
import org.springframework.stereotype.Component;

@Component("WPX")
public class WpxAdapter implements DestionationAapter {

    @Override
    public String process(SubClass request){
        return "I took the path WPX: "+ request.getResults();
    }
}
