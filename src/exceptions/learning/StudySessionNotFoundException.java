package exceptions.learning;

import exceptions.DashBoardException;

public class StudySessionNotFoundException extends DashBoardException {
    public StudySessionNotFoundException(String message) {
        super(message);
    }

    public StudySessionNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
