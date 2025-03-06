package com.demo.demo.Home.Repo;

import java.util.List;

import com.demo.demo.Home.entity.InsertUserDTO;
import com.demo.demo.Home.entity.User;

public interface IRepository {
    List<User> getAllUser();
    List<User> searchByEmail(String email);
    void insertUser(InsertUserDTO dto);
}
