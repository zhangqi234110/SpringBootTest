package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 张齐 on 2019/9/13.
 */
@RestController
public class Hellow {
    @RequestMapping(value="hellow",method= RequestMethod.GET)
    @ResponseBody
    public Common Hellow(){
        return new Common(200,"你好啊","12313213211");
    }


}
