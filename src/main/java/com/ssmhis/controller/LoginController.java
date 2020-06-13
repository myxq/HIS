package com.ssmhis.controller;

import com.ssmhis.dto.Msg;
import com.ssmhis.model.User;
import com.ssmhis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @author 李永庆
 * @since 2019/9/15
 */
@Controller
@SessionAttributes("doctor")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index(Model model){
        return "login";
    }

    /**
     * 登录并发挥用户信息
     * @param user
     * @param model
     * @return
     */
    @RequestMapping(value = "login",method = RequestMethod.POST)
    @ResponseBody

    public Msg login(@RequestBody User user,Model model){
        User u = userService.login(user);
        if (u == null){
            return Msg.fail();
        }
        model.addAttribute("doctor",u);
        return Msg.success();
    }
}
