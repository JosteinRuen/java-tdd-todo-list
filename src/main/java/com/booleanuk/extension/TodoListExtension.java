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
