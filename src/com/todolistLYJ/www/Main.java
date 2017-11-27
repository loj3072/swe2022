package com.todolistLYJ.www;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Main(){

        /*TodoList listA = new TodoList("집에서할일");
        thisApp.addList(listA);
        TodoTask taskA_1 = new TodoTask("a");
        TodoTask taskA_2 = new TodoTask("b");
        TodoTask taskA_3 = new TodoTask("c");
        listA.addTask(taskA_1);
        listA.addTask(taskA_2);
        listA.addTask(taskA_3);

        TodoList listB = new TodoList("학교숙제");
        thisApp.addList(listB);
        TodoTask taskB_1 = new TodoTask("A");
        TodoTask taskB_2 = new TodoTask("B");
        listB.addTask(taskB_1);
        listB.addTask(taskB_2);
        */

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

                thisApp.getList(modList);

            }else if (input.startsWith(commands.get(4))){

                thisApp.getList(modList);

            }else System.out.print("형식오류. 재입력");

        }



        /*check:
        for (int i = 0; i < commands.size(); i++){
            if (input.startsWith(commands.get(i))){
                String[] tmp = input.split(":");
                switch (i){
                    case 1:
                        thisApp.addList2(input);
                        thisApp.printApp();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                }
            }else System.out.print("형식오류. 재입력");
            break check;
        }
        */

    }
}
