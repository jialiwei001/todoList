package com.pingan.note.dao;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author: 焦立伟
 * @PackageName: com.pingan.note.dao
 * @ClassName: User
 * @Description:
 * @date: 2019/11/24 10:40
 */
@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue
    private Long id;


    private String username;


    private String password;

    private String nickname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", passoword='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
