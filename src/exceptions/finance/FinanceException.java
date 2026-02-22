package exceptions.finance;

import exceptions.DashBoardException;

public class FinanceException extends DashBoardException {
    public FinanceException(String message) {
        super(message);
    }

    public FinanceException(String message, Throwable cause) {
        super(message, cause);
    }


}
