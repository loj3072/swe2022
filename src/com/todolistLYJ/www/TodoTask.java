package com.todolistLYJ.www;
//완료 체크, 완료된 할일 숨기기/보이기, 이름 수정, 미리 알림, 기한 설정
//나의 하루, 노트추가, 반복기능은 아직
//기한 설정- 날짜값만 들어갈 수 있으면 됨
//미리 알림- 시스템 시간을 읽어서 나의 기간과 비교해서 응답할 수 있도록. timer가 모든 목록에게 메소드를 호출..
//완료 체크, 이름 수정, 미리알림설정, 기한설정
//날짜 / 시간

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TodoTask { //implement Comparable
    // date 객체 쓰기
    String taskName;
    boolean isAlarm;
    boolean setDate;
    Date date = new Date();

    TodoTask(String taskName){
        this.taskName = taskName;
        boolean isAlarm = false;
        boolean setDate = false;
    }

    public void changeTaskName(String newTaskName){
        this.taskName = newTaskName;
    }

    public void settingAlarm(){ // 날짜, 시간


    }

    public void settingDate(){ // 날짜

    }

    public void deleteTask(){

    }

    public void getDateTime(){
        SimpleDateFormat formatter = new SimpleDateFormat ( "yyyy.MM.dd HH:mm:ss", Locale.KOREA );
        Date currentTime = new Date ( );
        String dTime = formatter.format ( currentTime );
    }
}
