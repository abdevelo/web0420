package com.kbstar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String main(){
        return "index";
    }

    @RequestMapping("/charts")
    public String login(Model model){
        model.addAttribute("center", "charts");
        return "index";
    }

    @RequestMapping("/tables")
    public String register(Model model){
        model.addAttribute("center", "tables");
        return "index";
    }
    // url : /quics?page=bs01
    @RequestMapping("/quics")
    public String quics(String page){
        return page;
    }

}
