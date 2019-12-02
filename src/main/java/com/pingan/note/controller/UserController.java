package com.pingan.note.controller;

import com.pingan.note.dao.User;
import com.pingan.note.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author: 焦立伟
 * @PackageName: com.pingan.note.controller
 * @ClassName: UserController
 * @Description:
 * @date: 2019/11/24 11:00
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("register")
    public String register(User user, Model model, HttpSession session){
        System.out.println("进入了User注册方法"+ user.toString());

        User register = userService.register(user);

        return "login";

    }

    @RequestMapping("login")
    public String login(User user,Model model,HttpSession session){

        System.out.println("进入了login方法"+ user.toString());

        User user1 = userService.findUser(user);

        if (user1 == null){
            model.addAttribute("result","用户名或密码错误请重新输入");
        }

        session.setAttribute("user",user1);

        return "redirect:findAll";
    }

    @RequestMapping("/")
    public String showLogin(){
        System.out.println("进入了中转到登录页面");

        return "login";
    }

}
