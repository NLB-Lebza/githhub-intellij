package com.lebo.stringtester.controller;

import com.lebo.stringtester.model.SubClass;
import com.lebo.stringtester.service.SService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/switch")
public class SController {
@Autowired
    private SService switchService;

@PostMapping
    public String sRequest(@RequestBody SubClass request){
    return switchService.processRequest((request));
}


}
