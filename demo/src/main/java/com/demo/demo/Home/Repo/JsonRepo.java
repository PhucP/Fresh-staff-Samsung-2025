package com.demo.demo.Home.Repo;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import com.demo.demo.Home.entity.InsertUserDTO;
import com.demo.demo.Home.entity.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

@Repository
@Qualifier("jsonRepo")
public class JsonRepo implements IRepository{
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public List<User> getAllUser() {
        InputStream inputStream = null;
        try {
            inputStream = new ClassPathResource("json/db.json").getInputStream();
            return objectMapper.readValue(inputStream, new TypeReference<List<User>>() {});
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    public List<User> searchByEmail(String email) {
        List<User> users = getAllUser();
        if(users!=null) {
            return users.stream().filter(user -> user.getEmail().contains(email)).collect(Collectors.toList());
        }  else {
            return null;
        }
    }

    @Override
    public void insertUser(InsertUserDTO dto) {
        // Implement insert logic here
    }

}
