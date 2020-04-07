package com.lh.gmall.user.controller;

import com.lh.gmall.user.bean.UmsMember;
import com.lh.gmall.user.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author liuhao
 * @Desc //
 * @DATE 2020/4/7 19:42
 */
@Controller
public class UserController {
    @Autowired
    Userservice userservice;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello index";
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        return userservice.getAllUser();
    }
}
