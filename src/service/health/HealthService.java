package service.health;

import java.util.List;
import java.util.ArrayList;

import model.health.*;

public class HealthService {
    // Fields
    private List<Workout> Workout = new ArrayList<>();
    private List<Meal> meal = new ArrayList<>();
    private List<Sleep> sleep = new ArrayList<>();
    private List<Mood> mood = new ArrayList<>();

    // Constructor
    public HealthService(
        List<Workout> Workout,
        List<Meal> meal,
        List<Sleep> sleep,
        List<Mood> mood
    ) {
        this.Workout = Workout;
        this.meal = meal;
        this.sleep = sleep;
        this.mood = mood;
    }


    // methods
    public void addWorkout() {

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
    public List<Meal> getMeal() { return meal; }
    public List<Sleep> getSleep() { return sleep; }
    public List<Mood> getMood() { return mood; }
}
