package com.mrp.vue.web.controller;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.mrp.vue.util.Result;
import org.apache.ibatis.annotations.ResultType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mr.p
 */
@RestController
@RequestMapping("/hello")
public class HelloController extends BaseController {

    @GetMapping("/echo")
    public Result echo(String echo){
        return Result.success(echo);
    }

}
