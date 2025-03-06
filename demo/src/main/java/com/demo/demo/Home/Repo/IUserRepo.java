package com.demo.demo.Home.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.demo.Home.entity.User;

public interface IUserRepo extends JpaRepository<User, Integer>{
    List<User> findByEmail(String email);
}
