package exceptions;

public class LearningException extends DashBoardException {
    public LearningException(String message) {
        super(message);
    }

    public LearningException(String message, Throwable cause) {
        super(message, cause);
    }
}
