package com.clloud.live.dao;

import com.clloud.live.entity.User;

import java.util.List;

public interface UserDao {
    /**
     * 列出用户列表
     * @return userList
     */
    List<User> queryUser();

    /**
     * 根据ID查询用户
     * @param userId
     * @return
     */
    User queryUserById(int userId);

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 删除用户
     * @param userId
     * @return
     */
    int deleteUser(int userId);
}
