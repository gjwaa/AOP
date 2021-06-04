package com.gjw.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void add(String name,String acc);
    void update();
    void delete();
    void select();
}
