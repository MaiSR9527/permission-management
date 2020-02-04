package com.msr.study.permission.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description: 管理员页面
 * @author: MaiShuRen
 * @date: 2020/2/3 22:26
 * @version: v1.0
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/index.page")
    public ModelAndView index() {
        return new ModelAndView("admin");
    }
}
