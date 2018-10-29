package pl.com.progrex88.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owenrs")
@Controller
public class OwnerController {

    @RequestMapping({"","/","/index","/index.html"})
    private String listOwners(){

        return "owners/index";
    }

}
