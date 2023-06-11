package resphoer.springframework.test.dao;

import resphoer.springframework.test.po.User;

public interface IUserDao {
    User queryUserInfoById(Long id);
}
