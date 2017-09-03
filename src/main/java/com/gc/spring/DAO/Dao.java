package com.gc.spring.DAO;

import com.gc.spring.tables.UsersEntity;

import java.util.List;

public interface Dao {

    List<UsersEntity> findAll();

    List<UsersEntity> findById();

    List<UsersEntity> findByUsername();

    boolean insertUser(UsersEntity user);

    boolean updateUser(UsersEntity user);

    boolean deleteUser(UsersEntity user);
}
