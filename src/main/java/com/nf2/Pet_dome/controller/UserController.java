package com.nf2.Pet_dome.controller;

import com.nf2.Pet_dome.dao.PUserMapper;
import com.nf2.Pet_dome.entity.PUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private PUserMapper pUserMapper;

    @RequestMapping(method = RequestMethod.GET)
    public String user(Model model){
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(Model model,  String u_LastName,String u_password){
        PUser pUser = pUserMapper.selByName(u_LastName, u_password);
        System.out.println(pUser);
        if(pUser != null){
            return "redirect:/index";
        }
        return "redirect:/user";

    }


}
