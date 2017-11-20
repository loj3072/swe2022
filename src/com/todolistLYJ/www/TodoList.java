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
// static메소드는 위쪽에 몰아놓자.
    //할 일이 아무것도 없으면 없다는 메시지를 줄 메소드도 추가
    //완료했는지

    public void addTask(){} //할 일 추가

    public void changeListName(String newListName){} //목록 이름 바꾸기

    public void sortingList(){} // field. 정렬

    public void changeTheme(){ //테마 변경
        theme.changeColor();
        theme.changePicture();
    }

    public void hideEndTask(){} // field. 완료된 할 일 숨기기 - getList 다시 호출

    //public void shareList(){} //보내기 기능은 안 함

    public void deleteList(){} //

}
