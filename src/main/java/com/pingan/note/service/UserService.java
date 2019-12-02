package com.pingan.note.service;

import com.pingan.note.dao.User;

/**
 * @author: 焦立伟
 * @PackageName: com.pingan.note.service
 * @ClassName: UserService
 * @Description:
 * @date: 2019/11/24 10:46
 */

public interface UserService {

    User  register(User user);

    User  findUser(User user);


}
