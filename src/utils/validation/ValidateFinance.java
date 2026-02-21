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

    }

    public static void validateCategory(CategoryType category) {

    }

    public static void validateDate(LocalDate date) {

    }

    public static void validateDescription(String description) {
        
    }
   
    public static void validateSource(String source) {
        
    }

    public static void validateRecur(boolean recur) {

    }
    
    public static void validateName(String name) {

    }

    public static void validateLimit(double limit) {

    }

    public static void validateSpent(double spent) {

    }

    public static void validatePeriod(String period) {

    }
}
