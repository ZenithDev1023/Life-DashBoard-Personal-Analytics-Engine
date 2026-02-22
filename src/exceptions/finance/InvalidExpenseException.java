package exceptions.finance;

import exceptions.DashBoardException;

public class InvalidExpenseException extends DashBoardException {
    public InvalidExpenseException(String message) {
        super(message);
    }

    public InvalidExpenseException(String message, Throwable cause) {
        super(message, cause);
    }
}
