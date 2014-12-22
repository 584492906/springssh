package com.shinowit.web;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2014/12/22.
 */
@Controller
@RequestMapping("/upload")
public class UpLoadFiledController {

    @RequestMapping("/field")
    public String upload(@RequestParam("photo") MultipartFile upload, HttpServletRequest request) {

        if (upload.isEmpty() == true) {
            return "/redirect:upload.html";
        }

        String realPath = request.getSession().getServletContext().getRealPath("/img/upload");
        try {
            FileUtils.copyInputStreamToFile(upload.getInputStream(), new File(realPath, upload.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(realPath);
        return "s";
    }


}
