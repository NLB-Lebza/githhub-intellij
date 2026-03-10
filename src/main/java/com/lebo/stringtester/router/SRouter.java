package com.lebo.stringtester.router;
import static com.lebo.stringtester.content.RouterContent.*;
import org.springframework.stereotype.Component;

import java.util.Map;




@Component
public class SRouter {
    private static  final Map<String, String> path = Map.of(
            Key_WX,WX,
            Key_APX,APX,
            Key_WPX,WPX

    );

    //logic of overriding, ill be using if statement--ParaC
    public String route(String first, String last ) {

        if (Key_APX.equals(last)) {
            return APX;

        }
        if (Key_WPX.equals(last)) {
            return WPX;
        }
        return path.getOrDefault(first,"Nothing");
    }
}

