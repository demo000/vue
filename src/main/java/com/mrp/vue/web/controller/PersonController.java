package com.mrp.vue.web.controller;

import com.mrp.vue.entity.Person;
import com.mrp.vue.service.PersonService;
import com.mrp.vue.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController extends BaseController {

    @Autowired
    private PersonService personService;

    @PostMapping("/findByName")
    public Result findByName(String name) {
        try {
            List<Person> list = personService.queryByName(name);
            return success(list);
        } catch (Exception e) {
            return Result.error("");
        }
    }

    @PostMapping("/query")
    public Result query(String name, String address) {
        try {
            List<Person> list = personService.findByNameLikeAndAddressLike(name, address);
            return success(list);
        } catch (Exception e) {
            return error();
        }

    }
    @PostMapping("/getAll")
    public Result getAll(){
        return success(personService.getAll());
    }
}
