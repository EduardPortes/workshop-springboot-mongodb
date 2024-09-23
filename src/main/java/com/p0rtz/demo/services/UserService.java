package com.p0rtz.demo.services;

import com.p0rtz.demo.domain.User;
import com.p0rtz.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return  repo.findAll();
    }
}
