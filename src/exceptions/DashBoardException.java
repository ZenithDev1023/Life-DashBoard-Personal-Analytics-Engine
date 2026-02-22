package exceptions;

public class DashBoardException extends Exception {
    public DashBoardException(String message) {
        super(message);
    }

    public DashBoardException(String message, Throwable cause) {
        super(message, cause);
    }
}
