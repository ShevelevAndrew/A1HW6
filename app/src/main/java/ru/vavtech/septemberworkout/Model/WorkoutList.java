package ru.vavtech.septemberworkout.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WorkoutList {
    private static final WorkoutList ourInstance = new WorkoutList();
    private List<Workout> workouts;

    public static WorkoutList getInstance() {
        return ourInstance;
    }

    private WorkoutList() {
        workouts = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            Workout workout = new Workout("Упражнение №" + (i+1));
            workout.setDescription("Описание №" + (i+1));
            workout.getFormattedRecordDate();
            workout.setRecordRepsCount(random.nextInt(101));
            workout.setRecordWeight(random.nextInt(101));
            workouts.add(workout);

        }
    }
}
