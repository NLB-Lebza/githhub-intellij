package com.lebo.stringtester.router;

import org.springframework.stereotype.Component;

import java.util.Map;


@Component
public class SRouter {
    private static  final Map<String, String> path = Map.of(
      "01","WX",
      "10","APX",
            "30","WPX"
    );

    //logic of overriding, ill be using if statement--ParaC
    public String route(String first, String last ) {

        if ("10".equals(last)) {
            return "APX";

        }
        if ("30".equals(last)) {
            return "WPX";
        }
        return path.getOrDefault(first,"Nothing");
    }
}

