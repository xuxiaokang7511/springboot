package com.retire.controller;

import com.retire.mapper.SysUserMapper;
import com.retire.pojo.SysUser;
import com.retire.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    private UserService UserService;

    @Autowired
    JavaMailSenderImpl mailSender;

    @ResponseBody
    @GetMapping("/selectAll")
    public List<SysUser> selectAll(){
        return UserService.selectAll();
    }

    @ResponseBody
    @GetMapping("/mail")
    private String mail(){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("标题");
        simpleMailMessage.setText("邮件内容");
        simpleMailMessage.setTo("2393189428@qq.com");
        simpleMailMessage.setFrom("2393189428@qq.com");
        mailSender.send(simpleMailMessage);
        return "发送成功";
    }

}
