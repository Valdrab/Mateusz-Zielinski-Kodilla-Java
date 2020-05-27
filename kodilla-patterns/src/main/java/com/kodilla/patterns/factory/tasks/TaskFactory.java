package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Quick shopping", "Water", 6.0);
            case PAINTING:
                return new PaintingTask("Household painting", "Beige", "Living room");
            case DRIVING:
                return new DrivingTask("Joyride", "City outskirts", "Car");
            default:
                return null;
        }
    }
}
