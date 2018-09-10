package com.yaskss.service;

import com.yaskss.model.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
