package com.demo.demo.Home.Repo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserRepoFactory {
    private final IRepository userRepo;
    private final IRepository jsonRepo;

    public UserRepoFactory(
        @Qualifier("userRepo") IRepository userRepo, 
        @Qualifier("jsonRepo") IRepository jsonRepo) {
        this.userRepo = userRepo;
        this.jsonRepo = jsonRepo;
    }

    public IRepository getUserRepo(String type) {
        if(type.equalsIgnoreCase("Json")) return jsonRepo;
        else return userRepo;
    }
}
