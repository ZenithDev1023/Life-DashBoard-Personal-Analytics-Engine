package utils.validation;

import java.time.LocalDate;

import enums.CategoryType;

public class ValidateFinance {

    public static void validateId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("ID cannot be null or empty");
        }
    }

    public static void validateAmount(double amount) {
        if (amount < 0.0) {
            throw new IllegalArgumentException("Amount must be positive!");
        }
    }

    public static void validateCategory(CategoryType category) {
        if (category == null) {
            throw new IllegalArgumentException("Category cannot be null!");
        }

    }

    public static void validateDate(LocalDate date) {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null!");
        }

        if (date.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Date cannot be in the past");
        }
    }

    public static void validateDescription(String description) {
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Description cannot be null or empty!");
        }
    }
   
    public static void validateSource(String source) {
        if (source == null || source.trim().isEmpty()) {
            throw new IllegalArgumentException("Source cannot be null or empty!");
        }
    }
    
    public static void validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty!");
        }
    }

    public static void validateLimit(double limit) {
        if (limit < 0.0) {
            throw new IllegalArgumentException("Limit must be positive!");
        }
    }

    public static void validateSpent(double spent) {
        if (spent < 0.0) {
            throw new IllegalArgumentException("Spent must be positive!");
        }
    }

    public static void validatePeriod(String period) {
        if (period == null || period.trim().isEmpty()) {
            throw new IllegalArgumentException("Period cannot be null or empty!");
        }
    }
}
