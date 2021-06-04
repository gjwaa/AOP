package com.gjw.diy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version 1.0
 * @author: gjw
 * @date: 2021/6/1 16:59
 * @desc:
 */
//@Controller
//@RequestMapping("userController")
public class UserController {
//    @RequestMapping("testAop")
    public void testAop(String name){
        System.out.println("userController被调用了");
        System.out.println("name:"+name);
    }
}
