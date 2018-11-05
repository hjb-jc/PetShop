package com.nf2.Pet_dome.controller;

import com.nf2.Pet_dome.dao.PPetMapper;
import com.nf2.Pet_dome.entity.PPet;
import com.nf2.Pet_dome.entity.PUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/pet")
public class PetController {
    @Autowired
    private PPetMapper pPetMapper;

    @RequestMapping(method = RequestMethod.GET)
    public String sel(Model model){
        List<PPet> pPets = pPetMapper.selectAll();
        model.addAttribute("pPets",pPets);
        return "index";
    }

    @RequestMapping(path = "/add",method = RequestMethod.GET)
    public String add(Model model){
        //pPetMapper.insert();
        return "addPet";
    }

    @RequestMapping("/del/{p_Id}")
    public String del(@PathVariable("p_Id") int id,Model model){
        int i = pPetMapper.deleteByPrimaryKey(id);
        if(i>0){
            model.addAttribute("msg","删除成功！");
            return "redirect:/pet";
        }
        return null;
    }

    @RequestMapping(value ="/sou",method = RequestMethod.POST)
    public String search(String search,Model model){
        List<PPet> pPets = pPetMapper.selectByName(search);
        model.addAttribute("pPets",pPets);
        return "index";
    }



//    @RequestMapping(value = "/user",produces = "application/json")
//    @ResponseBody
//    public String del111(@RequestBody PUser pUser){
//
//
//        return null;
//    }

}
