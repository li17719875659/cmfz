package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @AUTHOR licy
 * @create 2017-12-11-15:23
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService us;

    @RequestMapping("/aa")
    public String aa( Model model){
        List<User> users = us.findAll();
        model.addAttribute("users",users);

        return "index";
    }

    @RequestMapping("/add")
    public String add(User user){
        us.add(user);
        return "redirect:/user/aa";
    }
}
