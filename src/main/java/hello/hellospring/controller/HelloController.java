package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    //HTTP GET메서드. hello페이지가 불려지면(url)
    @GetMapping("hello")
    public String hello(Model model){
        //data 키로 hello! 값넣음
        model.addAttribute("data","hello!!");
        return "hello"; //resources >templates > hello
    }
}
