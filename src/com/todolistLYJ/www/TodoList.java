package com.todolistLYJ.www;

import java.util.ArrayList;

public class TodoList {
    String listName;
    ArrayList<TodoTask> task_inList;
    TodoTask tasks;
    TodoTheme theme;

    TodoList(String listName){
        this.listName = listName;
        this.task_inList = null;
    }

    public void addTask(){}

    public void changeListName(String newListName){}

    public void sortingList(){}

    public void changeTheme(){
        theme.changeColor();
        theme.changePicture();
    }

    public void hideEndTask(){}

    public void shareList(){}

    public void deleteList(){}

}
