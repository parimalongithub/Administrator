package com.example.admistrator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.admistrator.data.getdata;

@Controller
public class controller {
    @Autowired 
    private getdata data;

    

    @GetMapping("/")
    public String home(){
        return "Admistrator";
    }

    @GetMapping("/support/general")
    public String genral_support(){
        return "general_support";
    }
    @GetMapping("/support/Technical")
    public String Technical(){
        data.find_all_department();
        return "Technical_support";
    }


}
