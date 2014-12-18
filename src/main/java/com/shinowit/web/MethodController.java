package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/method")
public class MethodController {

    @RequestMapping("/method1/{stuname}/{userpass}")
    @ResponseBody
    public String test(@PathVariable("stuname") String stuName, @PathVariable("userpass") String userPass) {


        return stuName + userPass;


    }

    @RequestMapping("/method2")
    public String test1(RedirectAttributes redirectAttributes) {

        redirectAttributes.addFlashAttribute("s", "field error");

        return "redirect:/test/query";
    }

    @RequestMapping("/")
    public String test2() {

        return "s";
    }
}
