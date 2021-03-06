package com.project_news.Service.UserServices;

import com.project_news.Entity.User;
import com.project_news.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public ArrayList<User> getUser() {
        return (ArrayList<User>) userRepository.findAll();
    }

    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId).get();
    }

    @Override
    public void deleteUserById(Long userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public User updateUserById(Long userId, User user) {
        User editUser = userRepository.findById(userId).get();
        if(Objects.nonNull(user.getUserName()) && !" ".equalsIgnoreCase(user.getUserName())){
            editUser.setUserName(user.getUserName());
        }
        if (Objects.nonNull(user.getPassword()) && !" ".equalsIgnoreCase(user.getPassword())){
            editUser.setPassword(user.getPassword());
        }
        return userRepository.save(editUser);
    }
}
