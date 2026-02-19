package exceptions;

public class DashBoardException extends RuntimeException {
    public DashBoardException(String message) {
        super(message);
    }

    public DashBoardException(String message, Throwable cause) {
        super(message, cause);
    }
}
