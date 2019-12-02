package com.pingan.note.service.Impl;

import com.pingan.note.dao.User;
import com.pingan.note.jpa.UserJpa;
import com.pingan.note.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: 焦立伟
 * @PackageName: com.pingan.note.service.Impl
 * @ClassName: UserServiceImpl
 * @Description:
 * @date: 2019/11/24 10:50
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserJpa userJpa;

    @Override
    public User register(User user) {

        User saveResult = userJpa.save(user);

        return saveResult;
    }

    @Override
    public User findUser(User user) {

        User findResult = userJpa.findByUsernameAndPassword(user.getUsername(), user.getPassword());

        return findResult;
    }
}
