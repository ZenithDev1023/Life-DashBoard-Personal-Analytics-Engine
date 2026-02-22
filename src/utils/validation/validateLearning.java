package utils.validation;

import java.time.LocalDateTime;

public class ValidateLearning {

    public static void validateId(int incomeId) {
        if (incomeId < 0) {
            throw new IllegalArgumentException("ID cannot be negative!");
        }
    }

    public static void validateSubject(String subject) {
        if (subject == null || subject.trim().isEmpty()) {
            throw new IllegalArgumentException("Subject cannot be null or empty!");
        }
    }

    public static void validateTopic(String topic) {
        if (topic == null || topic.trim().isEmpty()) {
            throw new IllegalArgumentException("Topic cannot be null or empty!");
        }
    }

    public static void validateDuration(int duration) {
        if (duration < 0) {
            throw new IllegalArgumentException("Duration must be positive!");
        }
    }

    public static void validateComprehension(int comprehension) {
        if (comprehension < 0) {
            throw new IllegalArgumentException("Comprehension must be positive!");
        }
    }

    public static void validateTime(LocalDateTime time) {
        if (time.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("Time cannot be in the past!");
        }
    }

    public static void validateTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty!");
        }
    }

    public static void validateAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Author cannot be null or empty!");
        }
    }

    public static void validatePages(int pages) {
        if (pages < 0) {
            throw new IllegalArgumentException("Pages must be positive!");
        }

    }

    public static void validatePagesRead(int pagesRead) {
        if (pagesRead < 0) {
            throw new IllegalArgumentException("Pages read must be positive!");
        }
    }

    public static void validateStart(LocalDateTime start, LocalDateTime finish) {
        if (start == null) {
            throw new IllegalArgumentException("Start cannot be null!");
        }
        if (start.isAfter(finish)) {
            throw new IllegalArgumentException("Start cannot be after finish!");
        }
    }

    public static void validateFinish(LocalDateTime finish, LocalDateTime start) {
        if (finish == null) {
            throw new IllegalArgumentException("Finish cannot be null!");
        }

        if (finish.isBefore(start)) {
            throw new IllegalArgumentException("Finish cannot be before start!");
        }
    }

    public static void validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty!");
        }
    }

    public static void validateLevel(int level) {
        if (level < 0) {
            throw new IllegalArgumentException("Level must be positive!");
        }
    }

    public static void validateHours(int hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Hours must be positive!");
        }
    }
}
