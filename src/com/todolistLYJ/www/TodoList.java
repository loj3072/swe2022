package com.todolistLYJ.www;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class TodoList implements Serializable {
    String listName;
    ArrayList<TodoTask> taskInList;
    TodoTheme theme;

    TodoList(String listName){
        this.listName = listName;
        this.taskInList = new ArrayList<TodoTask>();
    }

// static메소드는 위쪽에 몰아놓자.
    //할 일이 아무것도 없으면 없다는 메시지를 줄 메소드도 추가
    //완료했는지

    public ArrayList<TodoTask> getTaskInList(){
        return taskInList;
    }

    public void printList(){
        if (this.taskInList.size() == 0){
            System.out.println("There is no Task");
        }
       try {
           for (int i = 0; i < this.taskInList.size(); i++) {
               String name = this.taskInList.get(i).getTaskName();
               String deadL = this.taskInList.get(i).getDeadlineStr();
               //Date deadL = this.taskInList.get(i).getTaskDeadLine();
               boolean alarm = this.taskInList.get(i).getIsAlarm();
               if (alarm){
                   System.out.println("- [O] " + name + " / " + deadL + " / " + "알림");
               }else System.out.println("- [-]" + name + deadL);
            }
        }catch (NullPointerException e){
            System.out.println("There is no Task");
        }
    }


    public String getListName() {
        return listName;
    }

    public int getNumofTaskInList(){
        int num = this.taskInList.size();
        return num;
    }

    public void addTask(String tda){ // Task_Date_Alarm
        String[] array;
        array = tda.split(","); // 할일명, 날짜, 알림
        TodoTask newTask = new TodoTask(array[0]);
        newTask.deadlineStr = array[1];
        //newTask.deadline = (Date) array[1];//17.12.3형식을 어떻게 Date로 바꾸지...
        if (array.length == 3 ){
            newTask.isAlarm = true;
        }else newTask.isAlarm = false;

        this.taskInList.add(newTask);

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
