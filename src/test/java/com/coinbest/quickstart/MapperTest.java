package com.coinbest.quickstart;

import com.coinbest.quickstart.domain.User;
import com.coinbest.quickstart.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class MapperTest {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void TestBCryptPasswordEncoder(){

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encode = passwordEncoder.encode("1234");
        System.out.println(encode);

    }



    @Test
    public void testUserMapper(){

        List<User> userList = userMapper.selectList(null);

        ArrayList<Object> list = new ArrayList<>();

        System.out.println(list);
    }





}
