package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean(name = "toDoList")
    public TaskList getToDoList() {
        TaskList taskList = new TaskList();
        taskList.addTask("taskToDo");
        return taskList;
    }

    @Bean(name = "inProgressList")
    public TaskList getInProgressList() {
        TaskList taskList = new TaskList();
        taskList.addTask("taskInProgress");
        return taskList;
    }

    @Bean(name = "doneList")
    public TaskList getDoneList() {
        TaskList taskList = new TaskList();
        taskList.addTask("taskDone");
        return taskList;
    }

    @Bean
    public Board getBoard() {
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }
}
