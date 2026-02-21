package model.health;

import java.time.LocalDateTime;

import enums.MealType;

import utils.validation.ValidateHealth;

public class Meal {
    // Fields
    private String id = "UNASSIGNED";
    private String name = "UNASSIGNED";
    private int calories = 0;
    private MealType type = null;
    private LocalDateTime time = null;

    // Constructor
    public Meal (
            String id,
            String name,
            int calories,
            MealType type,
            LocalDateTime time
    ) {
        ValidateHealth.validateId(id);
        ValidateHealth.validateName(name);
        ValidateHealth.validateCalories(calories);
        ValidateHealth.validateType(type);
        ValidateHealth.validateTime(time);

        this.id = id;
        this.name = name;
        this.calories = calories;
        this.type = type;
        this.time = time;
    }


    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public int getCalories() { return calories; }
    public MealType getType() { return type; }
    public LocalDateTime getTime() { return time; }

    // Setters
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setCalories(int calories) { this.calories = calories; }
    public void setType(MealType type) { this.type = type; }
    public void setTime(LocalDateTime time) { this.time = time; }

    @Override
    public String toString() {
        return String.format(
                "ID: %s, Name: %s, Calories: %d, Type: %s, Time: %s",
                id, name, calories, type, time
        );
    }
}
