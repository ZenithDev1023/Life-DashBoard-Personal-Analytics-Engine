package exceptions.learning;

import exceptions.DashBoardException;

public class LearningException extends DashBoardException {
    public LearningException(String message) {
        super(message);
    }

    public LearningException(String message, Throwable cause) {
        super(message, cause);
    }
}
