package com.jpa.test.dao.copy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.jpa.test.entities.User;

@Repository
public interface UserReposetory extends JpaRepository<User, Integer>{

}
