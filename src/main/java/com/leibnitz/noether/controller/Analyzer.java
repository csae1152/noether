package com.leibnitz.noether.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author helmut
 */
@Controller
public class Analyzer implements Analyze{
    @RequestMapping("/index")
    @ResponseBody
    public String goToHomePage () {
        return "working";
    }    

    @Override
    public void readData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
