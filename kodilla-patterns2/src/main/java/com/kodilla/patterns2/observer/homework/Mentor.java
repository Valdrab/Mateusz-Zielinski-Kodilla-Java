package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(StudentTasks studentTasks) {
        System.out.println(name + ": New tasks to check from " + studentTasks.getStudentName() + "\n" +
                " (total: " + studentTasks.getTasks().size() + " tasks.)");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
