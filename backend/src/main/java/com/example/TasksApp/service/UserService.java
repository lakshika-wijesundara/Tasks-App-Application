package com.example.TasksApp.service;

import com.example.TasksApp.dto.Response;
import com.example.TasksApp.dto.UserRequest;
import com.example.TasksApp.entity.User;
public interface UserService {

    Response<?> signUp(UserRequest userRequest);
    Response<?> login(UserRequest userRequest);
    User getCurrentLoggedInUser();
}
