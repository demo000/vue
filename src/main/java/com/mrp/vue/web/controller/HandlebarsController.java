package com.mrp.vue.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("handlebars")
public class HandlebarsController extends BaseController {

    @RequestMapping(value = "/{page}")
    public String page(@PathVariable String page){
        return "/handlebars/"+page;
    }
}
