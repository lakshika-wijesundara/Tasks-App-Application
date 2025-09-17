package com.example.TasksApp.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

public class UserRequest {

    @NotBlank(message="Username is required")
    private String userName;

    @NotBlank(message="Password is required")
    private String password;



}
