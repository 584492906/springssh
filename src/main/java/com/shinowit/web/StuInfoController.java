package com.shinowit.web;

import com.shinowit.entity.StuInfo;
import com.shinowit.framework.dao.BaseDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;


@Controller
@RequestMapping("/test")
public class StuInfoController {
    @Resource
    private BaseDAO<StuInfo> dao;

    @RequestMapping("/query")
    public ModelAndView queryAll() {
        List<StuInfo> stu_list = dao.listAll(StuInfo.class);
        ModelAndView result = new ModelAndView("test/query");
        result.addObject("stuList", stu_list);
        return result;
    }

    @RequestMapping("/stu")
    public ModelAndView stuInfo(String username,String userpass){

        ModelAndView result=new ModelAndView("/test/test");
        result.addObject("name",username);
        result.addObject("pass",userpass);
        return result;
    }
}
