package app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String index(){
        return "<h1>Хуй</h1><br /><a href=\"/1\">Пизда</a><a href=\"/2\">Жопа</a>";
    }
    @GetMapping("/1")
    public String index1(){
        return "<h1>Пизда</h1>";
    }
    @GetMapping("/2")
    public String index2(){
        return "<h1>Жопа</h1>";
    }

}
