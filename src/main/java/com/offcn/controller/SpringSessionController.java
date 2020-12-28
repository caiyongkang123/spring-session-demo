package com.offcn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class SpringSessionController {
    /**
     * 将信息存储在session中
     * @param session
     * @return
     */
    @GetMapping("/demon01")
    public String setSessionDemon(HttpSession session){
        session.setAttribute("message","今天中午吃什么呢");
        return  "ok";
    }
    @GetMapping("/demon02")
    public String getSessionDemon(HttpSession session){
        return  (String )session.getAttribute("message");
    }
}
