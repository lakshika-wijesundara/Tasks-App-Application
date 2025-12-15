package com.example.TasksApp.exceptions;

public class  NotFoundException extends RuntimeException{
    public NotFoundException(String ex){
        super(ex);
    }
}
