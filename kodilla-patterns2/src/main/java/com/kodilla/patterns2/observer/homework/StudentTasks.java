package com.kodilla.patterns2.observer.homework;

import java.util.*;

public class StudentTasks implements Observable {
    private final List<Observer> observers;
    private final Deque<String> tasks;
    private final String studentName;

    public StudentTasks(String studentName) {
        observers = new ArrayList<>();
        tasks = new ArrayDeque<>();
        this.studentName = studentName;
    }

    public void addTask(String task) {
        tasks.offerLast(task);
        notifyObservers();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public Queue<String> getTasks() {
        return tasks;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
