package com.zainmorshed.jobtracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zainmorshed.jobtracker.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    
}
    
