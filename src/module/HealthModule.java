import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import service.health.HealthService;
import views.*;
import views.health.MealView;
import views.health.WorkoutView;
import views.health.WeightView;

import enums.MealType;

import model.health.*;

public class HealthModule {
    // Fields
    private HealthService healthService;
    private WorkoutView workoutView;
    private MealView mealView;
    private WeightView weightView;
    private final Scanner scanner;
    private boolean running;

    private int workoutId = 0;
    private int mealId = 0;
    private int weightId = 0;


    public HealthModule(
        HealthService healthService,
        WorkoutView workoutView,
        MealView mealView,
        WeightView weightView,
        Scanner scanner,
        boolean running
    ) {
        this.healthService = healthService;
        this.workoutView = workoutView;
        this.mealView = mealView;
        this.weightView = weightView;
        this.scanner = scanner;
        this.running = running;
    }


    public void run() {
        while(running) {
            showMenu();
            int choice = getUserChoice();
            handleChoice(choice);
        }
    }


    public void showMenu() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("HEALTH");
        System.out.println("\n" + "=".repeat(50));

        System.out.println("1. Add Workout");
        System.out.println("2. Add Meal");
        System.out.println("3. Add Weight");
        System.out.println("4. Track Workout");
        System.out.println("5. Track Meal");
        System.out.println("6. Track Weight");
        System.out.println("7. Analyze");
        System.out.println("8. Back to Main Menu");

        System.out.print("Enter choice");
    }

    private int getUserChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private void handleChoice(int choice) {
        switch (choice) {
            case 1 -> addWorkout();

            case 2 -> addMeal();

            case 3 -> addWeight();

            case 4 -> trackWorkout();

            case 5 -> trackMeal();

            case 6 -> trackWeight();

            case 7 -> analyze();
    
            case 8 -> {
                System.out.println("Returing to Main Menu...");
                running = false;
            }

            default -> {
                System.out.println("Invalid option. Please try again.");
            }

        }
    }



    public void addWorkout() {
        System.out.println("\n--- Add Workout ---");

        System.out.print("Exercise: ");
        String exercise = scanner.nextLine();

        System.out.print("Duration: ");
        int duration = Integer.parseInt(scanner.nextLine());

        System.out.print("Sets: ");
        int sets = Integer.parseInt(scanner.nextLine());

        LocalDate date = LocalDate.now();

        healthService.addWorkout(workoutId++, exercise, duration, sets, date);
        System.out.println("Successfully added workout!");
    }

    public void addMeal() {
        System.out.println("\n--- Add Meal ---");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Calories: ");
        int calories = Integer.parseInt(scanner.nextLine());

        System.out.print("Type (BREAKFAST/LUNCH/DINNER/SNACK): ");
        MealType type = MealType.valueOf(scanner.nextLine().toUpperCase());

        LocalDateTime time = LocalDateTime.now();

        healthService.addMeal(workoutId++, name, calories, type, time);
        System.out.println("Meal added successfully!");
    }


    public void addWeight() {

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Height: ");
        int height = Integer.parseInt(scanner.nextLine());

        System.out.print("Weight: ");
        double weight = Double.parseDouble(scanner.nextLine());

        healthService.addWeight(weightId++, name, age, height, weight);
        System.out.println("Weight added successfully!");
    }


    public void trackWorkout() {
        System.out.println("\n--- Track Workout");

        System.out.print("ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println(workoutView.display(id));
    }


    public void trackMeal() {
        System.out.println("\n--- Track Meal ---");

        System.out.print("ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.println(mealView.display(id, name));
    }


    public void trackWeight() {
        System.out.print("ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println(weightView.display(id));
    }


    public void analyze() {
        System.out.println(workoutView.display(workoutId));
        System.out.println(mealView.display(mealId, mealView.getName()));
        System.out.println(weightView.display(weightId));
    }


    // Getters
    public HealthService getHealthService() { return healthService; }
    public WorkoutView getWorkoutView() { return workoutView; }
    public MealView getMealView() { return mealView; }
}

