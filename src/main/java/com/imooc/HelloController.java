package com.imooc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 214 on 2017/4/15.
 */
@RestController
public class HelloController {
    @Value("${cupSize}")
    private String cupSize;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return cupSize;
    }
}
