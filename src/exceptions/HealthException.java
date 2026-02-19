package exceptions;

public class HealthException extends DashBoardException {
    public HealthException(String message) {
        super(message);
    }   

    public HealthException(String message, Throwable cause) {
        super(message, cause);
    }
}
