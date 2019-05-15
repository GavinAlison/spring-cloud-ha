package com.alison.registry.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @Author huangyong
 * @Date 2019/5/9
 **/
@RestController
public class RegistryController {

    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }
}
