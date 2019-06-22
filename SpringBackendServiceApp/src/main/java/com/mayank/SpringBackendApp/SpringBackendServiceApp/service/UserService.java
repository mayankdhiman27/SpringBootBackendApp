package com.mayank.SpringBackendApp.SpringBackendServiceApp.service;

import com.mayank.SpringBackendApp.SpringBackendServiceApp.repository.UserRepository;
import com.mayank.SpringBackendApp.SpringBackendServiceApp.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAllUsers(){
        List<User> users = new ArrayList<>();

        userRepository.findAll().forEach(users::add);

        return users;
    }

    public User findUserbyId(Long id){
        userRepository.findById(id);
        return findUserbyId(id);
    }

    public User createUser(User user){
        userRepository.save(user);
        return findUserbyId(user.getId());
    }

    public Boolean updateUser(User user){
        if(userRepository.existsById(user.getId()) == true){
            userRepository.save(user);
            return true;
        }
        else{
            return false;
        }

    }

    public Boolean deleteUser(Long id){

        if(userRepository.existsById(id) == true){
            userRepository.delete(findUserbyId(id));
            return true;
        }
        else{
            return false;
        }

    }
    
}
