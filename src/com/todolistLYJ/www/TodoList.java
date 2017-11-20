package com.todolistLYJ.www;

import java.util.ArrayList;
import java.util.Collections;

public class TodoList {
    String listName;
    ArrayList<TodoTask> taskInList;
    TodoTheme theme;

    TodoList(String listName){
        this.listName = listName;
        this.taskInList = null;
    }

// static메소드는 위쪽에 몰아놓자.
    //할 일이 아무것도 없으면 없다는 메시지를 줄 메소드도 추가
    //완료했는지

    public String haveTask(){
        if (this.taskInList.isEmpty())
            return "There is no task.";
        return null;
    }

    public void addTask(TodoTask newTask){ //할 일 추가
        taskInList.add(newTask);
    }

    public void changeListName(String newListName){ //목록 이름 바꾸기
        this.listName = newListName;
    }

    public void sortingList(ArrayList<TodoTask> taskInList){ // field. 정렬
        Collections.sort(taskInList);
    }

    public void changeTheme(){ //테마 변경
        theme.changeColor();
        theme.changeImage();
    }


    public void hideEndTask(){ // field. 완료된 할 일 숨기기 - getList 다시 호출
        for(TodoTask task : this.taskInList){
            if (task.completed){
                task.show = false;
            }
        }
    }

    public void deleteTask(TodoTask deleteTask){
        taskInList.remove(deleteTask);
    }

}
