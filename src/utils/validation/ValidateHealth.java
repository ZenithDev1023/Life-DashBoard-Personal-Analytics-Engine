package utils.validation;

import java.time.LocalDate;
import java.time.LocalDateTime;

import enums.MealType;
import enums.MoodType;

public class ValidateHealth {

    public static void validateId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("ID cannot be negative!");
        }
    }

    public static void validateExercise(String exercise) {
        if (exercise == null || exercise.trim().isEmpty()) {
            throw new IllegalArgumentException("Exercise cannot be null or empty!");
        }
    }

    public static void validateDuration(int duration) {
        if (duration < 0) {
            throw new IllegalArgumentException("Duration must be positive!");
        }
    }

    public static void validateSets(int sets) {
        if (sets < 0) {
            throw new IllegalArgumentException("Sets must be positive!");
        }
    }

    public static void validateDate(LocalDate date) {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null!");
        }
        if (date.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Date cannot be in the past!");
        }
    }

    public static void validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty!");
        }
    }

    public static void validateCalories(int calories) {
        if (calories < 0) {
            throw new IllegalArgumentException("Calories must be positive!");
        }
    }

    public static void validateType(MealType type) {
        if (type == null) {
            throw new IllegalArgumentException("Meal type cannot be null!");
        }
    }

    public static void validateTime(LocalDateTime time) {
        if (time.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("Time cannot be in the past!");
        }
    }

    public static void validateHours(double hours) {
        if (hours < 0.0) {
            throw new IllegalArgumentException("Hours must be positive!");
        }
    }

    public static void validateQuality(int quality) {
        if (quality < 0) {
            throw new IllegalArgumentException("Quality must be positive!");
        }
    }

    public static void validateNotes(String notes) {
        if (notes == null || notes.trim().isEmpty()) {
            throw new IllegalArgumentException("Notes cannot be null or empty!");
        }
    }

    public static void validateMoodType(MoodType type) {
        if (type == null) {
            throw new IllegalArgumentException("Mood type cannot be null!");
        }
    }

    public static void validateEnergy(int energy) {
        if (energy < 0) {
            throw new IllegalArgumentException("Energy must be positive!");
        }
    }

    public static void validateStress(int stress) {
        if (stress < 0) {
            throw new IllegalArgumentException("Stress must be positive!");
        }
    }

    public static void validateAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be more than 0 and less than 120");
        }
    } 

    public static void validateHeight(int height) {
        if (height < 100 || height > 270) {
            throw new IllegalArgumentException("Height must be more than 100cm but less than 270cm");
        }
    }

    public static void validateWeight(double weight) {
        if (weight < 50  || weight > 800) {
            throw new IllegalArgumentException("Weight must be more than 50lbs but less than 800lbs");
        }
    }
}
