package com.mrp.vue.web.controller;

import com.mrp.vue.util.Result;

import java.io.Serializable;

/**
 * @author mr.p
 */
public class BaseController {
    protected Result success(Object data) {
        return Result.success(data);
    }
    protected Result error() {
        return Result.error("操作异常");
    }
}
