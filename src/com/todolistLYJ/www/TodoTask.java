package com.todolistLYJ.www;


public class TodoTask {
    String taskName;
    boolean setAlarm;
    boolean setDate;
    String note;
    boolean myday;

    TodoTask(String taskName){
        this.taskName = taskName;
        boolean myday = false;
        boolean setAlarm = false;
        boolean setDate = false;
        String note = null;
    }

    public void changeTaskName(){}

    public void addMyday(){}

    public void settingAlarm(){}

    public void settingDate(){}

    public void addNote(){}

    public void deleteTask(){}

}
