package com.coinbest.quickstart.service;

import com.coinbest.quickstart.domain.ResponseResult;
import com.coinbest.quickstart.domain.User;

public interface LoginService {

    /**
     * 登录
     * @param user
     * @return
     */
    ResponseResult login(User user);
}
