# Todo List

## Learning Objectives
- Use user stories to create a domain model
- Use the Red Green Refactor approach to create source code from tests

## Set up instructions
- Fork this repository and clone the forked version to your machine
- Open the root directory of the project in IntelliJ

## Exercise Instructions

It may be beneficial to work in groups during the design phase of this exercise.

1. Create domain models based on the requirements outlined below. It's recommended that you put a good effort into this step, it'll make the next steps much easier.
2. Add your domain model to either a file named `domain-model.md` or as a screenshot.
3. There is an empty class named `TodoList` in `./src/main/java/com.booleanuk/core/`, you should write your source code in here
4. There is an almost empty test class for the `TodoList` class in `./src/test/java/com.booleanuk/core`, you should write your tests in here. There is an example test to help you with the format, use the tests in previous exercises to help guide you in using the `Assertions` class
5. For each requirement below, use the Red Green Refactor approach to create a single test and then make it pass by writing source code. It's important to practice writing the test first, don't rob yourself of learning this vital skill.

## Core Requirements

- I want to add tasks to my todo list.
- I want to see all the tasks in my todo list.
- I want to change the status of a task between incomplete and complete.
- I want to be able to get only the complete tasks.
- I want to be able to get only the incomplete tasks.
- I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
- I want to remove tasks from my list.
- I want to see all the tasks in my list ordered alphabetically in ascending order.
- I want to see all the tasks in my list ordered alphabetically in descending order.

Class TodoList

| Variables                         | Methods                                   | Scenario                                                | Result                                 |
|-----------------------------------|-------------------------------------------|---------------------------------------------------------|----------------------------------------|
| HashMap<String, Boolean> todoList | addTask(String task)                      | Task already exists                                     | return false                           |
|                                   |                                           | Task doesn't exist                                      | add to hashmap and return true         |
|                                   | changeStatus(String task, Boolean status) | Task doesn't exist                                      | return false                           |
|                                   |                                           | Task exists                                             | change bool and return true            |
|                                   | getAllTasks()                             | Loops hashmap and constructs<br/> list of all tasks     | returns list of all taskNames          |
|                                   | getCompletedTasks()                       | Iterate map and construct<br/>list of completed tasks   | return list of completed tasks         |
|                                   | getUncompletedTasks()                     | Iterate map and construct<br/>list of uncompleted tasks | returns list of incomplete tasks       |
|                                   | searchTasks(String task)                  | task doesn't exist in map                               | print error, return empty String       |
|                                   |                                           | task exists in map                                      | return Task string with status         |
|                                   | removeTask(String s)                      | task doesn't exist in map                               | print error, return false              |
|                                   |                                           | task exists in map                                      | remove task key from map, return true  |
|                                   | getSortedTasks(String order)              | order is "Ascending"                                    | return sorted list in ascending order  |
|                                   |                                           | order is "Descending"                                   | return sorted list in descending order |
