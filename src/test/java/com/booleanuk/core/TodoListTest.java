package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

}
