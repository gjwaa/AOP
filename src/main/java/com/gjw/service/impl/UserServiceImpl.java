package com.gjw.service.impl;

import com.gjw.service.UserService;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UserServiceImpl implements UserService {

    @Override
    public void add(String name,String acc) {
        System.out.println("增加。。。");
    }

    @Override
    public void update() {
        System.out.println("修改。。。");
    }

    @Override
    public void delete() {
        System.out.println("删除。。。");
    }

    @Override
    public void select() {
        System.out.println("查询。。。");
    }
}
