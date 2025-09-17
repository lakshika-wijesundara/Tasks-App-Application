package com.example.TasksApp.repo;

import com.example.TasksApp.entity.Task;
import com.example.TasksApp.entity.User;
import com.example.TasksApp.enums.Priority;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByUser(User user, Sort sort);
    List<Task> findByCompletedAndUser(boolean complete, User user);
    List<Task> findByPriorityAndUser(Priority priority, User user, Sort sort);

}
