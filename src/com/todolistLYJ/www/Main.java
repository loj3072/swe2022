package com.todolistLYJ.www;

import java.util.ArrayList;
import java.util.Scanner;
//별도의 예외처리 중요!!!
//이번주 과제: 영속화. (save & load) 추가
//serialize(직렬화) 메모리 상의 정보들을 일렬로 세워서 저장할 수 있는 상태로 만드는 것 / unserialize
public class Main {
    Main(){

    }
    public static void main(String[] args){
        App thisApp = new App("thisApp");
        thisApp.printApp();

        ArrayList<String> commands = new ArrayList<String>();
        commands.add("addList:");
        commands.add("list:");
        commands.add("addTodo:");
        commands.add("complete:");
        commands.add("incomplete:");

        String modList = "";

        while (true){
            System.out.print("Enter command: ");
            Scanner in = new Scanner(System.in);

            if (in.equals("done")){
                break;
            }

            String input = in.nextLine();
            String[] tmp = input.split(":");
            String inp = tmp[1];

            if (input.startsWith(commands.get(0))){
                thisApp.addList(inp);
                thisApp.printApp();
            }else if (input.startsWith(commands.get(1))){
                thisApp.getList(inp);
                modList = inp;
            }else if (input.startsWith(commands.get(2))){
                thisApp.addTask(inp, modList);
                thisApp.getList(modList);
            }else if (input.startsWith(commands.get(3))){
                thisApp.taskComplete(inp, modList, true);
                thisApp.getList(modList);

            }else if (input.startsWith(commands.get(4))){
                thisApp.taskComplete(inp, modList, false);
                thisApp.getList(modList);

            }else System.out.print("형식오류. 재입력");

        }

    }
}
