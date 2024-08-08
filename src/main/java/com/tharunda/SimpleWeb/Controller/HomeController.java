package com.tharunda.SimpleWeb.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){


        return "Welcome to the homepage !!!";

    }

    @RequestMapping("/about")
    public String about(){

        return "we teach programming here !!!";

    }

}
