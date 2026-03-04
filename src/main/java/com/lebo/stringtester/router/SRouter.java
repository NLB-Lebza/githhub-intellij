package com.lebo.stringtester.router;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

import java.util.Map;


@Component
public class SRouter {
    private static  final Map<String, String> path = Map.of(
      "01","WX",
      "10","APX",
            "30","WPX"
    );

    //logic of overriding, ill be using if statement
    public String route(String last, String first ) {

        if ("10".equals(last)) {
            return "APX";
        }
        if ("30".equals(last)) {
            return "WPX";

        }
        if ("30".equals(first)) {
            return "WX";
        }
        return "Nothing";
    }
}

