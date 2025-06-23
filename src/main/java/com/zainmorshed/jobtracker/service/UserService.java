package com.zainmorshed.jobtracker.service;

import java.util.List;
import com.zainmorshed.jobtracker.model.User;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    User getUserByID(Long id);
    void deleteUser(Long id);
    User updateUser(Long id, User user);
}
