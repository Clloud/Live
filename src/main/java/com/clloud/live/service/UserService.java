package com.clloud.live.service;

import com.clloud.live.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 列出用户列表
     * @return userList
     */
    List<User> getUsers();

    /**
     * 根据ID查询用户
     * @param userId
     * @return
     */
    User getUserById(int userId);

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    boolean addUser(User user);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    boolean modifyUser(User user);

    /**
     * 删除用户
     * @param userId
     * @return
     */
    boolean deleteUser(int userId);
}
