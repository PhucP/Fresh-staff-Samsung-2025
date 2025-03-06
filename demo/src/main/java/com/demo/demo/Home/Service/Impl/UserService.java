package com.demo.demo.Home.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.demo.demo.Home.Repo.IRepository;
import com.demo.demo.Home.Repo.UserRepoFactory;
import com.demo.demo.Home.Service.IUserService;
import com.demo.demo.Home.entity.InsertUserDTO;
import com.demo.demo.Home.entity.User;

@Service
public class UserService implements IUserService {
    private IRepository repo;
    private final UserRepoFactory factory;

    @Value("${repo.type}")
    private String type;

    public UserService(UserRepoFactory factory) {
        this.factory = factory;
    }

    private IRepository getRepo() {
        if (repo == null) {
            repo = factory.getUserRepo(type);
        }
        return repo;
    }

    @Override
    public List<User> getAllUser() {
        return getRepo().getAllUser();
    }

    @Override
    public void insertAllUser(InsertUserDTO dto) {
        getRepo().insertUser(dto);
    }
}
