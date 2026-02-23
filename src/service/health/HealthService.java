package service.health;

import java.util.Random;

import java.util.List;

import enums.MealType;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;

import model.health.*;

public class HealthService {
    // Fields
    private List<Workout> Workout = new ArrayList<>();
    private List<Meal> Meal = new ArrayList<>();
    private List<Sleep> Sleep = new ArrayList<>();
    private List<Mood> Mood = new ArrayList<>();
    private List<Weight> Weight = new ArrayList<>();

    // Constructor
    public HealthService(
        List<Workout> Workout,
        List<Meal> Meal,
        List<Sleep> Sleep,
        List<Mood> Mood,
        List<Weight> Weight
    ) {
        this.Workout = Workout;
        this.Meal = Meal;
        this.Sleep = Sleep;
        this.Mood = Mood;
        this.Weight = Weight;
    }


    // methods
    public List<Workout> addWorkout(int id, String exercise, int duration, int sets, LocalDate date) {
        Workout workout = new Workout(id, exercise, duration, sets, date);

        Workout.add(workout);
        System.out.println("Workout added successfully!");

        return Workout;
    }


    public List<Meal> addMeal(int id, String name, int calories, MealType type, LocalDateTime time ) {
        Meal meal = new Meal(id, name, calories, type, time);

        Meal.add(meal);
        System.out.println("Meal added successfully!");

        return Meal;
    }


    public List<Weight> addWeight(int id, String name, int age, int height, double weight) {
        Weight w = new Weight(id, name, age, height, weight);

        Weight.add(w);
        System.out.println("Weight added successfully!");

        return Weight;
    }


    public StringBuilder trackWorkout(int id) {
        StringBuilder sb = new StringBuilder();

        for (Workout workout : Workout) {
            if (workout.getId() == id) {
                sb.append("\n=== Track Workout ===");
                sb.append("ID: " + id);
                sb.append("Exercise: " + workout.getExercise());
                sb.append("Duration: " + workout.getDuration());
                sb.append("Sets: " + workout.getSets());
                sb.append("Date: " + workout.getDate());
            } 
            System.out.println("Workout not found...");
        }

        return sb;
    }

    public StringBuilder trackMeal(int id) {
        StringBuilder sb = new StringBuilder();

        for (Meal meal : Meal) {
            if (meal.getId() == id) {
                sb.append("ID: " + meal.getId());
                sb.append("Name: " + meal.getName());
                sb.append("Calories " + meal.getCalories());
                sb.append("Type: " + meal.getType());
                sb.append("Time: " + meal.getTime());
            }
            System.out.println("Meal not found...");
        }

        return sb;
    }


    public StringBuilder trackWeightProgress(int id) {
        StringBuilder sb = new StringBuilder();
        for (Weight user : Weight) {
            if (user.getId() == id) {
                sb.append(user.getWeight()).append("\n");
            }
            System.out.println("User not found...");
        }

        return sb;
    }


    public StringBuilder getWorkoutsThisWeek(int id) {
        StringBuilder sb = new StringBuilder();

        LocalDate today = LocalDate.now();
        LocalDate startOfWeek = today.with(DayOfWeek.MONDAY);
        LocalDate endOfWeek = today.with(DayOfWeek.SUNDAY);

        for (Workout workout : Workout) {
            if (!workout.getDate().isBefore(startOfWeek) && !workout.getDate().isAfter(endOfWeek)) {
                sb.append(workout.toString()).append("\n");
            }
        }

        return sb;
    }


    public double calculateAverageSleep(double totalHours) {
        for (Sleep sleep : Sleep) {
            if (sleep.getHours() > 0.0) {
                totalHours += sleep.getHours();
            }
            System.out.println("Sleep must be more than " + sleep.getHours());
        }

        double averageSleep = totalHours / Sleep.size();

        System.out.println("Your average sleep is " + averageSleep + " hours");
        return averageSleep;
    }



    public StringBuilder suggestWorkout() {
        StringBuilder sb = new StringBuilder();

        if (Workout.isEmpty()) {
            return null;
        }

        Random random = new Random();
        Workout randomWorkout = Workout.get(random.nextInt(Workout.size()));

        sb.append(randomWorkout.getExercise()).append(", ");
        sb.append(randomWorkout.getDuration()).append(", ");
        sb.append(randomWorkout.getSets()).append("\n");

        return sb;
    }


    // Getters
    public List<Workout> getWorkout() { return Workout; }
    public List<Meal> getMeal() { return Meal; }
    public List<Sleep> getSleep() { return Sleep; }
    public List<Mood> getMood() { return Mood; }
    public List<Weight> getWeight() { return Weight; }
}
