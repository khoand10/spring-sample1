package com.khoa.controller;

import com.khoa.bean.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MailController {
    @Autowired
    Mail mail;

    @RequestMapping("mail")
    public String loadForm() {
        return "sendMailForm";
    }

    @RequestMapping("send")
    public String sendMail(
            @RequestParam("from") String from,
            @RequestParam("to") String to,
            @RequestParam("subject") String subject,
            @RequestParam("body") String body,ModelMap model
    ) {
        mail.send(from,to,subject,body);
        model.addAttribute("message","Send Mail Success!");
        return "sendMailForm";
    }
}
