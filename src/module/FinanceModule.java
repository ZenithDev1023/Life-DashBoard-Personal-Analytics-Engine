import java.util.Scanner;

import service.finance.FinanceService;
import views.*;

public class FinanceModule {
    // Fields
    private FinanceService financeService;
    private ExpenseView expenseView;
    private BudgetView budgetView;

    Scanner scanner = new Scanner(System.in);


    public FinanceModule(
        FinanceService financeService,
        ExpenseView expenseView,
        BudgetView budgetView,
        Scanner scanner
    ) {
        this.financeService = financeService;
        this.expenseView = expenseView;
        this.budgetView = budgetView;
        this.scanner = scanner;
    }


    // methods
    public void run() {

    }


    public void showMenu() {

    }


    public void addExpenses() {

    }


    public void analyze() {

    }
    


    public FinanceService getFinanceService() { return financeService; }
    public ExpenseView getExpenseView() { return expenseView; }
    public BudgetView getBudgetView() { return budgetView; }
}