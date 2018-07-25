package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuchanglong on 2018/7/23.
 */
    @RestController    //等同于同时加上了@Controller和@ResponseBody
    public class HelloController {

        //访问/hello或者/hi任何一个地址，都会返回一样的结果
        @RequestMapping(value = {"hi"},method = RequestMethod.GET)
        public String say(){
            return "hi you!!!";
        }
    }
