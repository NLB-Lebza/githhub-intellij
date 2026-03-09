package com.lebo.stringtester.service;

import com.lebo.stringtester.adapterService.DestionationAapter;
import com.lebo.stringtester.router.SRouter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.context.ApplicationContext;
import com.lebo.stringtester.model.SubClass;

@Service
public class SService {
    //field injection
@Autowired
    private SRouter router;
@Autowired
    private ApplicationContext context;


    //we need this for the controller
    public String processRequest(SubClass request) {

        String first = request.RouterKeyOne();
String last=request.RouterKeyTwo();
String destination = router.route(first,last);

if ("Nothing".equals(destination)){
    return "Invalid entry";
}
        DestionationAapter adapter= (DestionationAapter) context.getBean(destination);

        return adapter.process(request);
    }
}