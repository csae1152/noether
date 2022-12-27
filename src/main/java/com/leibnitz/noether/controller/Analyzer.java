package com.leibnitz.noether.controller;

import java.util.StringTokenizer;
import java.util.concurrent.ConcurrentSkipListMap;
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
      StringTokenizer st = new StringTokenizer("this is a test");
        ConcurrentSkipListMap<String, String> input = new ConcurrentSkipListMap<>(); 
                
      
    }
}
