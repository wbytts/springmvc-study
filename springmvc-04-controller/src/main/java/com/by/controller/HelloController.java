package com.by.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangby
 * @version 0.0.1
 * @date 2020-10-10 16:08
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("msg", "Hello MVC!");
        return "hello";
    }

    @RequestMapping("/aLongTask")
    @ResponseBody
    public String testLongTime() {

        return "asd";
    }

}
