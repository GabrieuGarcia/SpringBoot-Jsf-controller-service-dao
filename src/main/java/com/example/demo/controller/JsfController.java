package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "jsfController")
public class JsfController {

    @Autowired
    public String loadTodoPage() {
        checkPermission();
        return "/todo.xhtml";
    }

    private void checkPermission() {
    }
}