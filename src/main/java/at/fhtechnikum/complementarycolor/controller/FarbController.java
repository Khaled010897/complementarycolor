package at.fhtechnikum.complementarycolor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FarbController {
    @GetMapping("/")
    String ComplementaryColors(){
        return "This Website shows the complementary of a color. Syntax is http://localhost:8080/%7Bcolor%7D";
    }

    @GetMapping("/{color}")
    public static String ComplementaryColor(@PathVariable String color){
        if(color.equals("red")){
            return "Die komplementär Farbe von Rot ist Grün";
        }
        if(color.equals("yellow")){
            return "Die komplementär Farbe von Gelb is Violett";
        }
        if(color.equals("purble")){
            return "Die komplementär Farbe von Violett ist Gelb";
        }
        if(color.equals("green")){
            return "Die komplementär Farbe von Grün ist Rot";
        }
        if(color.equals("blue")){
            return "Die komplementär Farbe von Blau ist Orange";
        }
        if(color.equals("orange")){
            return "Die komplementär Farbe von Orang ist Blau";
        }



        return "Diese Farbe ist nicht vorhanden";
    }

}
