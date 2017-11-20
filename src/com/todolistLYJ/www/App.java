package com.todolistLYJ.www;

import java.util.ArrayList;

public class App {
    String appName;
    ArrayList<TodoList> listInApp;

    App(String appName){
        this.appName = appName;
        this.listInApp = null;
    }
    public void addList(TodoList newLIst){
        listInApp.add(newLIst);
    }

    public void deleteList(TodoList todoList){
        listInApp.remove(todoList);
    }
}
