package com.demo.demo.Home.Service;

import java.util.List;

import com.demo.demo.Home.entity.InsertUserDTO;
import com.demo.demo.Home.entity.User;

public interface IUserService {
    public List<User> getAllUser();

    public void insertAllUser(InsertUserDTO dto);
}
