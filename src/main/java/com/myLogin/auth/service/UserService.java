package com.myLogin.auth.service;

import com.myLogin.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
