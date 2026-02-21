package model.health;

import java.time.LocalDate;

import utils.validation.ValidateHealth;

public class Workout {
    // Fields
    private String id = "UNASSIGNED";
    private String exercise = "UNASSIGNED";
    private int duration = 0;
    private int sets = 0;
    private LocalDate date = null;

    // Constructor
    public Workout(
        String id,
        String exercise,
        int duration,
        int sets,
        LocalDate date
    ) {
        ValidateHealth.validateId(id);
        ValidateHealth.validateExercise(exercise);
        ValidateHealth.validateDuration(duration);
        ValidateHealth.validateSets(sets);
        ValidateHealth.validateDate(date);

        this.id = id;
        this.exercise = exercise;
        this.duration = duration;
        this.sets = sets;
        this.date = date;
    }


    // Getters
    public String getId() { return id; }
    public String getExercise() { return exercise; }
    public int getDuration() { return duration; }
    public int getSets() { return sets; }
    public LocalDate getDate() { return date; }

    // Setters
    public void setId(String id) { this.id = id; }
    public void setExercise(String exercise) { this.exercise = exercise; }
    public void setDuration(int duration) { this.duration = duration; }
    public void setSets(int sets) { this.sets = sets; }
    public void setDate(LocalDate date) { this.date = date; }


    @Override
    public String toString() {
        return String.format(
            "ID: %s, Exercise: %s, Duration: %d, Sets: %d, Date: %d",
            id, exercise, duration, sets, date

        );
    }
    
}
