package com.shinowit.web;

import com.shinowit.entity.StuInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/login")
    public String login(StuInfo stuInfo, HttpServletRequest request) {
        if (stuInfo.getStuName().equals("admin") && stuInfo.getStuId().equals("001")) {
            HttpSession session = request.getSession();
            session.setAttribute("user", stuInfo);
            return "redirect:/test/query";
        } else {
            return "s";
        }
    }
}
