package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify,
                                     @RequestParam String name, @RequestParam String email, @RequestParam String password) {
        model.addAttribute("name", name);
        model.addAttribute("email", email);
//        if ("test" == user.getPassword()) {
//           return "user/index";
//        } else{
//            return "user/add";
//        }
        return "user/index";
    }


}
