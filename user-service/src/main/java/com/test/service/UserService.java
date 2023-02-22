package com.test.service;

import com.test.entity.User;

public interface UserService {

    User getUserById(int uid);

    int getUserBookCount(int uid);

    int updateBookCount(int uid,int count);

}
