package com.example.TasksApp.service;

import com.example.TasksApp.dto.Response;
import com.example.TasksApp.dto.TaskRequest;
import com.example.TasksApp.entity.Task;
import java.util.List;

public interface TaskService {
    Response<Task> createTask(TaskRequest taskRequest);
    Response<List<Task>> getAllMyTasks();
    Response<Task> getTaskById(Long id);
    Response<Task> updateTask(TaskRequest taskRequest);
    Response<Void> deleteTask(Long id);
    Response<List<Task>> getMyTasksByCompletionStatus(boolean completed);
    Response<List<Task>> getMyTasksByPriority(String priority);
}
