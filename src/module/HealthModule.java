import java.util.Scanner;

import service.health.HealthService;
import views.*;

public class HealthModule {
    // Fields
    private HealthService healthService;
    private WorkoutView workoutView;
    private MealView mealView;

    Scanner scanner = new Scanner(System.in);


    public HealthModule(
        HealthService healthService,
        WorkoutView workoutView,
        MealView mealView
    ) {
        this.healthService = healthService;
        this.workoutView = workoutView;
        this.mealView = mealView;
    }


    public void run() {

    }


    public void showMenu() {

    }


    public void addWorkout() {

    }


    public void trackMeal() {

    }


    public void analyze() {

    }


    // Getters
    public HealthService getHealthService() { return healthService; }
    public WorkoutView getWorkoutView() { return workoutView; }
    public MealView getMealView() { return mealView; }
}

