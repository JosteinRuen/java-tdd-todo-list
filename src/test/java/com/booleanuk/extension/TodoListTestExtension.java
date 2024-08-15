package com.booleanuk.extension;

import com.booleanuk.core.TodoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TodoListTestExtension {
    @Test
    public void addTaskTest() {
        TodoListExtension todoList = new TodoListExtension();

        Assertions.assertTrue(todoList.addTask("Make Dinner"));
    }

    @Test
    public void updateTaskNameByIDTest(){
        TodoListExtension todoList = new TodoListExtension();
        todoList.addTask("Work out");
        todoList.addTask("Eat dinner");

        Assertions.assertTrue(todoList.updateTaskNameByID(1, "Walk the dog"));
        Assertions.assertEquals("Walk the dog", todoList.todoList.get(0).getTaskName());
    }

    @Test
    public void updateStatusByIDTest(){
        TodoListExtension todoList = new TodoListExtension();
        todoList.addTask("Work out");
        todoList.addTask("Eat dinner");

        Assertions.assertTrue(todoList.updateStatusByID(1, true));

        //Sanity check
        for (int i = 0; i < todoList.todoList.size(); i++){
            System.out.println(todoList.todoList.get(i));
        }
    }

    @Test
    public void getDateAndTimeTest(){
        TodoListExtension todoList = new TodoListExtension();
        todoList.addTask("Work out");
        todoList.addTask("Eat dinner");

        Assertions.assertTrue(todoList.updateStatusByID(1, true));
    }


}
