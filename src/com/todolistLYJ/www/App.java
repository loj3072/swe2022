package com.todolistLYJ.www;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class App implements Serializable{
    public String appName;
    private ArrayList<TodoList> listInApp;

    public App(String appName){
        this.appName = appName;
        listInApp = new ArrayList<TodoList>();
    }

    public void save() throws IOException {
        Path p = Paths.get("C:/todooo", "todoSave.txt");
        if (!Files.exists(p)){ Files.createFile(p); }
        ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(p));
        out.reset();
        out.writeObject(this);
    }

    public void load() throws IOException {
        Path p = Paths.get("C:/todooo", "todoSave.txt");
        ObjectInputStream in = new ObjectInputStream(Files.newInputStream(p));
        try {
            App loaded = (App) in.readObject();
            this.listInApp = loaded.listInApp;
            in.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<TodoList> getListInApp(){
        return listInApp;
    }

    public void addList(String newListname){
        TodoList newList = new TodoList(newListname);
        this.listInApp.add(newList);
    }

    public void deleteList(TodoList todoList){
        this.listInApp.remove(todoList);
    }

    public void printApp(){
        if (this.listInApp.size() == 0){
            System.out.println("There is no List");
        }
        try {
            for (int i = 0; i < this.listInApp.size(); i++) {
                String name = this.listInApp.get(i).getListName();
                int num = this.listInApp.get(i).getNumofTaskInList();
                System.out.println("- " + name + " " + num);
            }
        }catch (NullPointerException e){
            System.out.println("There is no List");
        }
    }

    public void getList(String inp) {
        int a = -1;
        for (int i = 0; i<this.listInApp.size(); i++){
            if (inp.equals(this.listInApp.get(i).getListName())){
                this.listInApp.get(i).printList();
                break;
            }else a = i;
        }
        if (a == this.listInApp.size()-1){
            System.out.println("Not Found");
        }
    }

    public void addTask(String inp, String modList) {
        for (int i = 0; i<this.listInApp.size(); i++){
            if (modList.equals(this.listInApp.get(i).getListName())){
                this.listInApp.get(i).addTask(inp);
                break;
            }else;
        }

    }

    public void taskComplete(String inp, String modList, boolean a) {
        for (int i = 0; i<this.listInApp.size(); i++){
            if (modList.equals(this.listInApp.get(i).getListName())){
                TodoList modL = this.listInApp.get(i);
                for (int j=0; j<modL.taskInList.size();j++){
                    if (modL.equals(modL.taskInList.get(j))){
                        modL.taskInList.get(j).completed = a;
                        break;
                    }
                }
                break;
            }else;
        }
    }


}
