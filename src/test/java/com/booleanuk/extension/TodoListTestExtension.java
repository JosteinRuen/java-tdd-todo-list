package com.booleanuk.extension;

import com.booleanuk.core.TodoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TodoListTestExtension {
    @Test
    public void addTaskTest() {
        TodoList todoList = new TodoList();

        Assertions.assertTrue(todoList.addTask("Make Dinner"));
    }


}
