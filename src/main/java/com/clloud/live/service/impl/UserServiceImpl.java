package com.clloud.live.service.impl;

import com.clloud.live.dao.UserDao;
import com.clloud.live.entity.User;
import com.clloud.live.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUsers() {
        return userDao.queryUser();
    }

    @Override
    public User getUserById(int userId) {
        return userDao.queryUserById(userId);
    }

    @Transactional
    @Override
    public boolean addUser(User user) {
        if (user.getNickname() != null && !"".equals(user.getNickname())) {
            user.setCreateeTime(new Date());
            user.setUpdateTime(new Date());
            try {
                int effectedNum = userDao.insertUser(user);
                if (effectedNum > 0) {
                    return true;
                } else throw new RuntimeException("添加用户失败");
            } catch (Exception e) {
                throw new RuntimeException("添加用户失败：" + e.getMessage());
            }
        }
        else {
            throw new RuntimeException("用户信息不能为空");
        }
    }

    @Override
    public boolean modifyUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(int userId) {
        return false;
    }
}
