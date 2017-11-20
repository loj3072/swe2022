package com.todolistLYJ.www;

import java.util.ArrayList;

public class TodoList implements Comparable<TodoTask> {
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

    public void addTask(TodoTask newTask){
        taskInList.add(newTask);
    }//할 일 추가

    public void changeListName(String newListName){
        this.listName = newListName;
    } //목록 이름 바꾸기

    public void sortingList(){} // field. 정렬

    public void changeTheme(){ //테마 변경
        theme.changeColor();
        theme.changeImage();
    }


    public void hideEndTask(){} // field. 완료된 할 일 숨기기 - getList 다시 호출

    //public void shareList(){} //보내기 기능은 안 함

    public void deleteList(){} //

    @Override
    public int compareTo(TodoTask o) {
        return 0;
    }
}
