package com.pingan.note.jpa;

import com.pingan.note.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: 焦立伟
 * @PackageName: com.pingan.note.jpa
 * @ClassName: UserJpa
 * @Description:
 * @date: 2019/11/24 10:44
 */

@Repository
public interface UserJpa extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String name,String password);

}
