package exceptions.relationship;

import exceptions.DashBoardException;

public class InvalidContactException extends DashBoardException {
    public InvalidContactException(String message) {
        super(message);
    }

    public InvalidContactException(String message, Throwable cause) {
        super(message, cause);
    }
}
