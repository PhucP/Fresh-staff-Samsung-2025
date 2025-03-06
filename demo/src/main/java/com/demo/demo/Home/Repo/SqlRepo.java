package com.demo.demo.Home.Repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.demo.demo.Home.entity.InsertUserDTO;
import com.demo.demo.Home.entity.User;

@Qualifier("userRepo")
@Repository
public class SqlRepo implements IRepository {
    private final IUserRepo iUserRepo;

    public SqlRepo(IUserRepo iUserRepo) {
        this.iUserRepo = iUserRepo;
    }

    @Override
    public List<User> getAllUser() {
        return iUserRepo.findAll();
    }

    @Override
    public List<User> searchByEmail(String email) {
        return iUserRepo.findByEmail(email);
    }

    @Override
    public void insertUser(InsertUserDTO dto) {
        iUserRepo.saveAll(dto.users);
    }

}
