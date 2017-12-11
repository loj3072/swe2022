package com.todolistLYJ.www;
//완료 체크, 완료된 할일 숨기기/보이기, 이름 수정, 미리 알림, 기한 설정
//나의 하루, 노트추가, 반복기능은 아직
//기한 설정- 날짜값만 들어갈 수 있으면 됨
//미리 알림- 시스템 시간을 읽어서 나의 기간과 비교해서 응답할 수 있도록. timer가 모든 목록에게 메소드를 호출..
//완료 체크, 이름 수정, 미리알림설정, 기한설정
//날짜 / 시간

import java.io.Serializable;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TodoTask implements Comparable<TodoTask>, Serializable { //implement Comparable
    // date 객체 쓰기
    String taskName;
    boolean isAlarm;
    boolean deadlineOver;
    String deadlineStr;
    Date deadline;
    boolean completed;
    boolean show;
    TimerTask todoTimerTask = new TimerTask() {
        @Override
        public void run() {
            System.out.println("Alarm!!!");
        }
    };

    TodoTask(String taskName){
        this.taskName = taskName;
        this.isAlarm = false;
        this.deadlineOver = false;
        this.completed = false;
        this.show = true;
        this.deadline = null;
    }
    public String getTaskName() {
        return this.taskName;
    }
    public String getDeadlineStr() {
        return deadlineStr;
    }
    public Date getTaskDeadLine() {
        return this.deadline;
    }
    public boolean getIsAlarm() {return this.isAlarm;}

    public void changeTaskName(String newTaskName){ this.taskName = newTaskName; }

    public void taskCompleted(){ this.completed = true; }

    public void taskUncompleted(){ this.completed = false; }

    public void alarmSet(){ this.isAlarm = true; }

    public void alarm(Date alarmDate, Timer alarmTime){ // 날짜, 시간
        while (this.isAlarm){
            Timer t = alarmTime;
            Date d = alarmDate;
            t.schedule(todoTimerTask, d);
        }
    }

    public void setDeadline(Date deadline){ // 날짜
        this.deadline = deadline;
    }

    public void checkDeadlineOver(Date deadline){
        Date today = new Date();
        if (deadline.after(today)){
            this.deadlineOver = true;
        }
    }

    @Override
    public int compareTo(TodoTask task) {
        return taskName.compareTo(task.taskName);
    }
}
