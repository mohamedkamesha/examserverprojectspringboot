package com.exam.examserver.repo;

import com.exam.examserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User,Long> {
    User findByUserName(String userName);
}
