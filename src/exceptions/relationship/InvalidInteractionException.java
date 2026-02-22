package exceptions.relationship;

import exceptions.DashBoardException;

public class InvalidInteractionException extends DashBoardException {
    public InvalidInteractionException(String message) {
        super(message);
    }

    public InvalidInteractionException(String message, Throwable cause) {
        super(message, cause);
    }
}
