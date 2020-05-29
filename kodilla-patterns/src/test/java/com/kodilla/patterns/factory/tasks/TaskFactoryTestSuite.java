package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.createTask(TaskFactory.SHOPPING);
        assert shopping != null;
        shopping.executeTask();
        //Then
        Assert.assertEquals("Quick shopping", shopping.getTaskName());
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.createTask(TaskFactory.PAINTING);
        assert painting != null;
        painting.executeTask();
        //Then
        Assert.assertEquals("Household painting", painting.getTaskName());
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.createTask(TaskFactory.DRIVING);
        assert driving != null;
        driving.executeTask();
        //Then
        Assert.assertEquals("Joyride", driving.getTaskName());
        Assert.assertTrue(driving.isTaskExecuted());
    }

    @Test
    public void testFactoryNullTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task nullTask = factory.createTask("Null");
        //Then
        Assert.assertNull(nullTask);
    }
}
