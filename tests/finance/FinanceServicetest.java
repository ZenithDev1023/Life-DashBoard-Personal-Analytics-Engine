package tests.finance;

import service.finance.FinanceService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FinanceServicetest {

    @Test 
    void testAddExpense() {

        FinanceService finance = new FinanceService();

        int before = finance.getBalance();

        finance.addExpense(200);

        int after = finance.getBalance();

        assertEquals(before - 200, after);
    }

    @Test
    void testCaluclateSavingsRate() {

        FinanceService finance = new FinanceService();

        assertEquals(, );
    }

    @Test
    void testPredictNextMonth() {

        FinanceService finance = new FinanceService();

        assertEquals(, );
    }

    @Test
    void testBudgetStatus() {

        FinanceService finance = new FinanceService();

        assertEquals(, );
    }

    @Test
    void testFindPatterns() {

        FinanceService finance = new FinanceService();

        assertEquals(, );
    }
}
