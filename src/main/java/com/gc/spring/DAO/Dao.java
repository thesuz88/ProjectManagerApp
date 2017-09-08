package com.gc.spring.DAO;

import com.gc.spring.tables.UsersEntity;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface Dao {

    List<UsersEntity> findAll();

    List<UsersEntity> findById(@RequestParam("username")String username);

    List<UsersEntity> findByUsername();

    void insertUser(UsersEntity user);

    void updateUser(UsersEntity user);

    void deleteUser(UsersEntity user);
}
