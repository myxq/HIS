package com.ssmhis.service.impl;

import com.ssmhis.dao.UserDao;
import com.ssmhis.model.User;
import com.ssmhis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 李永庆
 * @since 2019/9/15
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User login(User user) {
        User user1 = userDao.selectWithInfo(user);
        return user1;
    }
}
