package com.exam.examserver.service.impl;

import com.exam.examserver.model.Role;
import com.exam.examserver.model.User;
import com.exam.examserver.repo.RoleRepository;
import com.exam.examserver.repo.UserRepository;
import com.exam.examserver.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    final private UserRepository userRepository;
    final private RoleRepository roleRepository;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public User createUser(User user, Set<Role> roles)   {
        try {
            User local = userRepository.findByUserName(user.getUserName());
            if (local != null) {

                throw new Exception("User already exits ");
            }

            // create user

            for (Role role : roles) {
                role.getUsers().add(user);


                roleRepository.save(role);
            }
            user.getRoles().addAll(roles);
            userRepository.save(user);
        }catch (Exception e){

            e.getCause();
        }


        return user;
    }

    @Override
    public User getUser(String userName) {
        return userRepository.findByUserName(userName);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
