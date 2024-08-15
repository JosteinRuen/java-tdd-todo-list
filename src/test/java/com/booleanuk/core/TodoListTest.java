package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TodoListTest {
    @Test
    public void exampleTest() {
        TodoList todoList = new TodoList();

        Assertions.assertTrue(todoList.addTask("Make Dinner"));
    }

    @Test
    public void changeStatusTest(){
        TodoList todoList = new TodoList();

        todoList.addTask("Make Dinner");
        Assertions.assertTrue(todoList.changeStatus("Make Dinner", true));

    }

    @Test
    public void getAllTasksTest(){
        TodoList todoList = new TodoList();
        todoList.addTask("Work out");
        todoList.addTask("Make dinner");
        ArrayList<String> newList = new ArrayList<>();
        newList = todoList.getAllTasks();

        Assertions.assertEquals("Work out Status: Incomplete", newList.get(1));
    }

}
