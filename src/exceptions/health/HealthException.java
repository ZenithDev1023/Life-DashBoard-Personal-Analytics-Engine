package exceptions.health;

import exceptions.DashBoardException;

public class HealthException extends DashBoardException {
    public HealthException(String message) {
        super(message);
    }   

    public HealthException(String message, Throwable cause) {
        super(message, cause);
    }
}
