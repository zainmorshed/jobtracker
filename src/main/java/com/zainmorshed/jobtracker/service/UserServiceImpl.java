package com.zainmorshed.jobtracker.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.zainmorshed.jobtracker.repository.UserRepository;
import com.zainmorshed.jobtracker.model.User;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserByID(Long id){
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUser(Long id) {
        //user -> { ... } is a lambda, a short way to write a function.
        userRepository.findById(id).ifPresent(user -> { //"If the user exists, take that user object (call it user), and run the code inside the {}.”"
            userRepository.deleteById(id);
        });
    }

    @Override
    public User updateUser(Long id, User user) {
        return userRepository.findById(id).map(existingUser -> {
            existingUser.setName(user.getName());
            existingUser.setEmail(user.getEmail());
            return userRepository.save(existingUser);
        }).orElse(null);
    }
    //need to comme back to this - putmapping doesnt seem to be working
    

    /*
     * In your method, .map(...) is the perfect choice because you're:
     * Checking if a user exists
     * If it does, updating and saving it
     * If not, returning null with .orElse(null)
     *
     * Clean and safe ✅
     */

}
