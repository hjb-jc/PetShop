package com.nf2.Pet_dome.controller;

import com.nf2.Pet_dome.dao.PUserMapper;
import com.nf2.Pet_dome.entity.PUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private PUserMapper pUserMapper;

    @RequestMapping(method = RequestMethod.GET)
    public String user(Model model) {
        return "login2";
    }

    @RequestMapping(value = "/login1", method = RequestMethod.POST)
    public String login(Model model, String u_Name, String u_password) {
//        PUser pUser = pUserMapper.selByName(u_Name);
//        if(pUser != null){
//            if(!pUser.getU_password().equals(u_password)){
//                model.addAttribute("err","密码不正确");
//                return "login2";
//            }
//        }else {
//            model.addAttribute("err","用户名不存在");
//            return "login2";
//        }
        return "redirect:/pet";


//        PUser pUser = new PUser();
//        pUser.setU_Name(u_Name);
//        pUser.setU_password(u_password);
//        if ( u_Name == "" && u_password==""  ){
//            model.addAttribute("err","用户名和密码不能为空");
//            return "login2";
//        }
//        PUser pUser1 = pUserMapper.selByName(pUser);
//        if (pUser1 == null) {
//            model.addAttribute("err", "不好意思，没有此用户！");
//            return "login2";
//        }
//        return "redirect:/pet";
    }


    @RequestMapping(value = "/re", method = RequestMethod.GET)
    public String re(Model model) {
        return "reg";
    }

    @RequestMapping("/add")
    public String add(Model model, String u_Name, String u_Email, String u_password, String u_Phone, int u_UserSatus) {
        PUser pUser = new PUser();
        pUser.setU_Name(u_Name);
        pUser.setU_Email(u_Email);
        pUser.setU_password(u_password);
        pUser.setU_Phone(u_Phone);
        pUser.setU_UserSatus(u_UserSatus);
        int i = pUserMapper.insert(pUser);

        if (i > 0) {
            model.addAttribute("msg", "注册成功,请登录");
            return "login2";
        } else {
            model.addAttribute("msg", "注册失败，请再来一次");
            return "user";
        }
    }


}
