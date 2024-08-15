package com.booleanuk.core;

import java.util.HashMap;

public class TodoList {
    HashMap<String, Boolean> toDoMap;

    String output;

    public TodoList(){
        toDoMap = new HashMap<>();
    }

    public Boolean addTask(String task){
        if (toDoMap.containsKey(task)){
            System.out.println("Task already exists in todolist");
            return false;
        }else{
            toDoMap.put(task, false);
            return true;
        }
    }

}
