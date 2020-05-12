package com.clloud.live.dao;

import com.clloud.live.entity.User;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    @Ignore
    public void queryUser() {
        List<User> users = userDao.queryUser();
        assertEquals(2, users.size());
    }

    @Test
    @Ignore
    public void queryUserById() {
        User user = userDao.queryUserById(1);
        assertEquals("Ann", user.getNickname());
    }

    @Test
    @Ignore
    public void insertUser() {
        User user = new User();
        user.setNickname("Cathy");
        int effectedNum = userDao.insertUser(user);
        assertEquals(1, effectedNum);
    }

    @Test
    @Ignore
    public void updateUser() {
        User user = new User();
        user.setNickname("Cathyy");
        user.setId(3);
        user.setUpdateTime(new Date());
        int effectedNum = userDao.updateUser(user);
        assertEquals(1, effectedNum);
    }

    @Test
    public void deleteUser() {
        int effectedNum = userDao.deleteUser(3);
        assertEquals(1, effectedNum);
    }
}