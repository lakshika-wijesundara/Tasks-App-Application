package com.example.TasksApp.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserRequest {

    @NotBlank(message = "Username is required")
    private String username;   // change to lowercase for correct Lombok getter

    @NotBlank(message = "Password is required")
    private String password;
}
