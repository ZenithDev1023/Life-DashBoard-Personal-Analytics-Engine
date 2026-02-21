package utils.validation;

import enums.InteractionType;

import java.io.ObjectStreamException;
import java.nio.channels.FileLockInterruptionException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ValidateRelationship {

    public static void validateId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("ID cannot be null or empty!");
        }
    }

    public static void validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty!");
        }
    }

    public static void validateEmail(String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty!");
        }
    }

    public static void validatePhone(String phone) {
        if (phone == null || phone.trim().isEmpty()) {
            throw new IllegalArgumentException("Phone number cannot be null or empty!");
        }
    }

    public static void validateBirthday(LocalDate birthday) {
        if (birthday == null) {
            throw new IllegalArgumentException("Birthday cannot be null!");
        }
    }

    public static void validateCategory(String category) {
        if (category == null || category.trim().isEmpty()) {
            throw new IllegalArgumentException("Category cannot be null or empty!");
        }
    }

    public static void validateInteraction(String interaction) {
        if (interaction == null || interaction.trim().isEmpty()) {
            throw new IllegalArgumentException("Interaction cannot be null or empty!");
        }
    }

    public static void validateType(InteractionType type) {
        if (type == null) {
            throw new IllegalArgumentException("Interaction type cannot be null!");
        }
    }

    public static void validateTime(LocalDateTime time) {
        if (time.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("Time cannot be in the past!");
        }
    }

    public static void validateNotes(String notes) {
        if (notes == null || notes.trim().isEmpty()) {
            throw new IllegalArgumentException("Notes cannot be null or empty!");
        }
    }
}
