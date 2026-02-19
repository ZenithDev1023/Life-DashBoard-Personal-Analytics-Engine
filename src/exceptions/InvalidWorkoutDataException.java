package exceptions;

public class InvalidWorkoutDataException extends DashBoardException {
    public InvalidWorkoutDataException(String message) {
        super(message);
    }

    public InvalidWorkoutDataException(String message, Throwable cause) {
        super(message, cause);
    }

    
}
