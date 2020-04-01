package com.yuetaowang.pindd.dao;

import com.yuetaowang.pindd.bean.User;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface UserDao {
    void insert(User user);

    void batchInsert(List<User> users);

    void deleteByName(String name);

    void deleteAll();

    void update(User user);

    Integer count();

    List<User> list();

    User queryByName(String name);

    JdbcTemplate getJdbcTemplate();

    // DDL
    // -------------------------------------------------------------------
    void truncate();

    void recreateTable();
}
