package com.booleanuk.extension;

import com.booleanuk.core.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class TodoListExtension {
    ArrayList<Task> todoList;
    int uniqueID = 0;

    public TodoListExtension(){
        todoList = new ArrayList<>();
    }

    public Boolean addTask(String task){
        LocalDate myDate = LocalDate.now();
        uniqueID += 1;
        Task newTask = new Task(task, uniqueID, false, myDate.toString());
        todoList.add(newTask);
        return true;
    }

    public Boolean updateTaskNameByID(int id, String newName){
        for (int i = 0; i < todoList.size(); i++){
            if (todoList.get(i).getUniqueID() == id){
                System.out.println("Found task, updating");
                todoList.get(i).setTaskName(newName);
                return true;
            }
        }
        System.out.println("couldnt' find task");
        return false;
    }

    public Boolean updateStatusByID(int id, Boolean status){
        for(int i = 0; i < todoList.size(); i++){
            if(todoList.get(i).getUniqueID() == id){
                System.out.println("Found task, updating status");
                todoList.get(i).setStatus(status);
                return true;
            }
        }
        System.out.println("Couldnt find task");
        return false;
    }

    public Boolean getDateAndTime(){
        if(todoList.size()== 0){
            return false;
        }

        for(int i = 0; i < todoList.size(); i++){
            System.out.println(todoList.get(i).getTaskName());
            System.out.println(todoList.get(i).getDateCreated());
        }
        return true;
    }


    public static void main(String[] args) {
        ArrayList<String> newlist;
        TodoListExtension myList = new TodoListExtension();
        myList.addTask("Make Dinner");
        myList.addTask("Work out");

        for (int i = 0; i < myList.todoList.size(); i++){
            System.out.println(myList.todoList.get(i).toString());
        }

    }





}
