package service.health;

import java.util.List;

import javax.swing.plaf.metal.MetalInternalFrameUI;

import enums.MealType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import model.health.*;

public class HealthService {
    // Fields
    private List<Workout> Workout = new ArrayList<>();
    private List<Meal> Meal = new ArrayList<>();
    private List<Sleep> Sleep = new ArrayList<>();
    private List<Mood> Mood = new ArrayList<>();

    // Constructor
    public HealthService(
        List<Workout> Workout,
        List<Meal> Meal,
        List<Sleep> Sleep,
        List<Mood> Mood
    ) {
        this.Workout = Workout;
        this.Meal = Meal;
        this.Sleep = Sleep;
        this.Mood = Mood;
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


    public void trackWorkout() {

    }

    public void trackMeal() {

    }


    public void getWorkoutsThisWeek() {

    }


    public int calculateAverageSleep() {

    }


    public double trackWeightProgress() {

    }


    public String suggestWorkout() {

    }


    // Getters
    public List<Workout> getWorkout() { return Workout; }
    public List<Meal> getMeal() { return Meal; }
    public List<Sleep> getSleep() { return Sleep; }
    public List<Mood> getMood() { return Mood; }
}
