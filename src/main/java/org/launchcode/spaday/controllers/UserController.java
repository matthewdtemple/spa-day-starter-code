package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping(value="add")
    public String displayAddUserForm(){
        return "user/add";
    }

    @GetMapping(value="")
    public String indexWorks(){
        return "user/index";
    }

    @PostMapping(value="")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        model.addAttribute("name", user.getUsername());
        model.addAttribute("email", user.getEmail());
        if ("test" == user.getPassword()) {
           return "user/index";
        } else{
            return "user/add";
        }
    }


}
