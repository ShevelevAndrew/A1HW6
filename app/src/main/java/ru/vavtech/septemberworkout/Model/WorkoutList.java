package ru.vavtech.septemberworkout.Model;

public class WorkoutList {
    private static final WorkoutList ourInstance = new WorkoutList();

    public static WorkoutList getInstance() {
        return ourInstance;
    }

    private WorkoutList() {
    }
}
