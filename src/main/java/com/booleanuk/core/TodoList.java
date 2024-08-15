package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.*;


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

    public Boolean changeStatus(String task, Boolean newStatus){
        if(toDoMap.containsKey(task)){
            if(toDoMap.get(task) == newStatus){
                System.out.println("Task already " + newStatus);
                return false;
            }else{
                toDoMap.put(task, newStatus);
                return true;
            }
        }else{
            System.out.println("Cannot find task: " + task + "in list");
            return false;
        }
    }

    public ArrayList<String> getAllTasks(){
        ArrayList<String> newList = new ArrayList<>();

        for (Map.Entry<String, Boolean> entry : toDoMap.entrySet()){
            //System.out.println(entry.getKey() + " " +  entry.getValue());
            if(!entry.getValue()){
                newList.add(entry.getKey() + " Status: Incomplete");
            }else{
                newList.add(entry.getKey() + "Status: Complete");
            }
        }

        //print out for user
        for (int i = 0; i < newList.size(); i++){
            System.out.println(newList.get(i));
        }

        return newList;
    }

    public ArrayList<String> getCompletedTasks(){

        //ArrayList<String> completedTasks = new ArrayList<>(toDoMap.keySet());
        ArrayList<String> completedTasks = new ArrayList<>();
        //Collections.sort(completedTasks);

        for (Map.Entry<String, Boolean> entry : toDoMap.entrySet()){
            if(entry.getValue() == true){
                completedTasks.add(entry.getKey());
            }
        }

        System.out.println(completedTasks);
        return completedTasks;
    }

    public ArrayList<String> getUncompletedTasks(){

        ArrayList<String> uncompletedTasks = new ArrayList<>();
        for (Map.Entry<String, Boolean> entry : toDoMap.entrySet()){
            if(entry.getValue() == false){
                uncompletedTasks.add(entry.getKey());
            }
        }

        System.out.println(uncompletedTasks);
        return uncompletedTasks;
    }

    public String searchTasks(String search){
        if (toDoMap.containsKey(search)){
            if (toDoMap.get(search) == true){
                return search + " Status: complete";
            }else{
                return search + " Status: uncomplete";
            }
        }else{
            System.out.println("Couldn't find task " + search);
            return "";
        }
    }

    public Boolean removeTask(String task){
        if(toDoMap.containsKey(task)){
            toDoMap.remove(task);
            return true;
        }else{
            System.out.println("Couldn't find task: " + task);
            return false;
        }
    }

    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        todoList.addTask("Make Dinner");
        todoList.addTask("Work out");
        todoList.changeStatus("Work out", true);
        String s = todoList.searchTasks("Work out");
        System.out.println(s);

    }





}
