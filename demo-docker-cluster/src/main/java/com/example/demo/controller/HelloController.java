package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author weijy
 * @date 2021/8/27 14:22
 */
@RestController
//访问路径：http://localhost:8080/helloCtl/hello
//@RequestMapping("/helloCtl")
public class HelloController {

    // 类上面没有@RequestMapping("/helloCtl") ，则访问路径：http://localhost:8080/hello
    @RequestMapping("/hello")
    public String Hello () {
        return "hello,PiggyKnight";
    }
}
