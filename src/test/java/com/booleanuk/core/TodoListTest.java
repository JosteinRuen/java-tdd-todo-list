package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void exampleTest() {
        TodoList todoList = new TodoList();

        Assertions.assertTrue(todoList.addTask("Make Dinner"));
    }


}
