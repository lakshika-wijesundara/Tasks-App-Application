package com.example.TasksApp.entity;
import com.example.TasksApp.enums.Role;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true, nullable = false)
    private String username;

    @Column(nullable = false)
    @NotBlank(message="Password is required")
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    @OneToMany(mappedBy = "user", cascade=CascadeType.ALL,orphanRemoval = true)
  private List<Task> tasks=new ArrayList<>();
}

