package com.khoa.controller;

import org.springframework.stereotype.Controller;
import com.khoa.bean.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.File;

@Controller
public class DlController {
    @Autowired
    @Qualifier("userVip")
    Users user;

    @Autowired
    @Qualifier("user")
    Users user1;

    @Autowired
    Users user2;

    @Autowired
    ServletContext context;

    @RequestMapping("")
    public String loadIndex(){
        return "index";
    }

    @RequestMapping("Dl")
    public String loadInfo(ModelMap model){
        model.addAttribute("user",user);
        model.addAttribute("user1",user1);
        model.addAttribute("user2",user2);
        return "info";
    }

    @RequestMapping("upLoadFile")
    public String loadUpFile(){
        return "upLoadFile";
    }
    @RequestMapping("upFile")
    public String upFile(ModelMap model, @RequestParam("images")MultipartFile image){
        if (image.isEmpty()) {
            model.addAttribute("message", "Vui lòng chọn file !");
        } else {
            try {
                String photoPath = context.getRealPath("/images/" + image.getOriginalFilename());
                image.transferTo(new File(photoPath));

                model.addAttribute("name", image.getOriginalFilename());
                model.addAttribute("type", image.getContentType());
                model.addAttribute("size", image.getSize());
                return "resultUpFile";
            } catch (Exception e) {
                model.addAttribute("message", "Lỗi lưu file"+e.getMessage());
            }
        }
        return "upLoadFile";
    }
}
