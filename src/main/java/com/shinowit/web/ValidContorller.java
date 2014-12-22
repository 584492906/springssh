package com.shinowit.web;

import com.shinowit.entity.StuInfo;
import com.shinowit.entity.StuInfoValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.validation.Valid;

@Controller
@RequestMapping("/valid")
public class ValidContorller {


    public void init1(DataBinder binder) {

        binder.setValidator(new StuInfoValidator());
    }

    @RequestMapping(value = "/valid", method = RequestMethod.POST)
    public String validStuname(@Valid @ModelAttribute("user") StuInfo stu, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/test/query";
        }
        return "/test/query";

    }
    @RequestMapping(value = "/valid1", method = RequestMethod.GET)
    public String validStuname1(@Valid @ModelAttribute("user") StuInfo stu, BindingResult bindingResult,Model model) {
        if (bindingResult.hasErrors()) {
            String s="错误";
            model.addAttribute("errors",s);
            return "/test/query";
        }
        return "/test/query";

    }
}
