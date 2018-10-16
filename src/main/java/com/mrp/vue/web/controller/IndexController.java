package com.mrp.vue.web.controller;

import com.mrp.vue.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController extends BaseController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = {"/index", "/"})
    public String index(ModelMap model) {
        model.put("title","Hello World");
        model.put("personList",personService.getAll());
        return "/index";
    }

    @RequestMapping("/person/{page}")
    public String page(@PathVariable String page){
        return "/person/"+page;
    }

}
