package com.project_news.Service.UserServices;

import com.project_news.Entity.User;

import java.util.ArrayList;

public interface UserService  {
    User addUser(User user);

    ArrayList<User> getUser();

    User getUserById(Long userId);

    void deleteUserById(Long userId);
}
