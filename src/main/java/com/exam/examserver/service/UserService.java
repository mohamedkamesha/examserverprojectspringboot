package com.exam.examserver.service;

import com.exam.examserver.model.Role;
import com.exam.examserver.model.User;

import java.util.Set;

public interface UserService {
    User createUser(User user, Set<Role> roles) ;
    User getUser(String userName);
    void deleteUser(Long id);
}
