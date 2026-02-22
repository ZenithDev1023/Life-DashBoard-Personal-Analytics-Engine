import java.time.LocalDate;
import java.util.Scanner;

import enums.CategoryType;
import model.finance.*;

import service.finance.FinanceService;

import views.finance.*;

public class FinanceModule {
    // Fields
    private final FinanceService financeService;
    private final ExpenseView expenseView;
    private final BudgetView budgetView;
    private final IncomeView incomeView;
    private final Scanner scanner;
    private boolean running;

    private int expenseId = 0;
    private int incomeId = 0;
    private int budgetId = 0;


    public FinanceModule(
        FinanceService financeService,
        ExpenseView expenseView,
        BudgetView budgetView,
        IncomeView incomeview,
        Scanner scanner,
        boolean running
    ) {
        this.financeService = financeService;
        this.expenseView = expenseView;
        this.budgetView = budgetView;
        this.incomeView = incomeview;
        this.scanner = scanner;
        this.running = true;
    }


    // methods
    public void run() {
        while (running) {
            showMenu();
            int choice = getUserChoice();
            handleChoice(choice);
        }
    }


    public void showMenu() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("FINANCES");
        System.out.println("=".repeat(50));
        System.out.println("1. Add Expense");
        System.out.println("2. Add Income");
        System.out.println("3. View Budget");
        System.out.println("4. View Expenses");
        System.out.println("5. View Income");
        System.out.println("6. Analyze");
        System.out.println("7. Back to Main Menu");
        System.out.println("=".repeat(50));

        System.out.print("Choose an option");
    }

    private int getUserChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private void handleChoice(int choice) {
        switch (choice) {
            case 1 -> addExpenses();
            case 2 -> addIncome();
            case 3 -> viewBudget();
            case 4 -> viewExpenses();
            case 5 -> viewIncome();
            case 6 -> analyze();
            case 7 -> {
                System.out.println("Returing to main menu...");
                running = false;
            }
            default -> System.out.println("Invalid option. Please try again.");
        }
    }


    public void addExpenses() {
        System.out.println("\n--- ADD EXPENSE ---");

        System.out.print("Amount: ");
        double amount = Double.parseDouble(scanner.nextLine());

        System.out.print("Category: ");
        CategoryType category = CategoryType.valueOf(scanner.nextLine());

        System.out.print("Enter date: ");
        LocalDate date = LocalDate.parse(scanner.nextLine());

        System.out.print("Description: ");
        String description = scanner.nextLine();

        Expense expense = financeService.addExpense(expenseId++, amount, category, date, description);

    }


    public void addIncome() {
        System.out.println("\n--- ADD INCOME ---");

        System.out.print("Amount: ");
        double amount = Double.parseDouble(scanner.nextLine());

        System.out.print("Source: ");
        String source = scanner.nextLine();

        System.out.print("Date: ");
        LocalDate date = LocalDate.parse(scanner.nextLine());

        System.out.print("Recurring (true/false): ");
        boolean recur = Boolean.parseBoolean(scanner.nextLine());

        Income income = financeService.addIncome(incomeId++, amount, source, date, recur);
    }


    public void viewBudget() {
        System.out.println("\n--- View Budget ---");

        System.out.print("ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.println(budgetView.display(id, name));
    }


    public void viewExpenses() {
        System.out.println("\n--- View Expenses ---");

        System.out.print("ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println(expenseView.display(id));
    }
    

    public void viewIncome() {
        System.out.println("\n--- View Income ---");

        System.out.print("ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println(incomeView.display(id));
    }


    public void analyze() {
        System.out.println(expenseView.display(expenseId));
        System.out.println(budgetView.display(budgetId, budgetView.getName()));
        System.out.println(incomeView.display(incomeId));
    }
    


    public FinanceService getFinanceService() { return financeService; }
    public ExpenseView getExpenseView() { return expenseView; }
    public BudgetView getBudgetView() { return budgetView; }
    public IncomeView getIncomeView() { return incomeView; }
}