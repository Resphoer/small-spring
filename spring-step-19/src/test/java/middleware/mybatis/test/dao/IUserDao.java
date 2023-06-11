package middleware.mybatis.test.dao;

import middleware.mybatis.test.po.User;

public interface IUserDao {
    User queryUserInfoById(Long id);
}
