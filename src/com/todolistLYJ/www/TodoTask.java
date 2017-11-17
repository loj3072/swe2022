package com.todolistLYJ.www;
//완료 체크, 이름 수정, 미리 알림, 기한 설정
//나의 하루, 노트추가, 반복기능은 아직
//기한 설정- 날짜값만 들어갈 수 있으면 됨
//미리 알림- 시스템 시간을 읽어서 나의 기간과 비교해서 응답할 수 있도록. timer가 모든 목록에게 메소드를 호출..

public class TodoTask { //implement Comparable
    // date 객체 쓰기
    String taskName;
    boolean setAlarm;
    boolean setDate;
    String note;
    boolean myday;

    TodoTask(String taskName){
        this.taskName = taskName;
        boolean myday = false;
        boolean isAlarm = false;
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
