package com.kodilla.patterns2.observer.homework;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class StudentTasksTestSuite {

    @Test
    public void testUpdate() {
        //Given
        StudentTasks mikesTasks = new StudentTasks("Mike");
        StudentTasks lorisTasks = new StudentTasks("Lori");
        StudentTasks johnsTasks = new StudentTasks("John");
        StudentTasks petersTasks = new StudentTasks("Peter");
        Mentor steve = new Mentor("Steve");
        Mentor paul = new Mentor("Paul");
        mikesTasks.registerObserver(steve);
        lorisTasks.registerObserver(paul);
        johnsTasks.registerObserver(steve);
        petersTasks.registerObserver(paul);
        //When
        mikesTasks.addTask("FIFO & LIFO");
        mikesTasks.addTask("Concurrency");
        lorisTasks.addTask("Collections");
        johnsTasks.addTask("JDBC");
        petersTasks.addTask("Builder pattern");
        //Then
        assertEquals(3, steve.getUpdateCount());
        assertEquals(2, paul.getUpdateCount());
    }
}
