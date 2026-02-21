package service.finance;

import model.finance.*;

import java.util.List;
import java.util.ArrayList;

public class FinanceService {
    private List<Expense> expenses = new ArrayList<>();
    private List<Income> income = new ArrayList<>();
    private List<Budget> budget = new ArrayList<>();

    Expense e = new Expense();
    String expenseId = e.getId();

    Income in = new Income();
    String incomeId = in.getId();

    Budget b = new Budget();
    String budgetId = b.getId();



    private int balance;


    public FinanceService() {}
    

    public FinanceService(
        List<Expense> expenses,
        List<Income> income,
        List<Budget> budget
    ) {
        for (int i = 0; i < expenses.size(); i++) {
            if (expenseId.equals(b.getId())) {
                throw new IllegalArgumentException("Expense ID already exists!");
            }
        }
        for (int i = 0; i < income.size(); i++) {
            if (incomeId.equals(in.getId())) {
                throw new IllegalArgumentException("Income ID already exists!");
            }
        }
        for (int i = 0; i < budget.size(); i++) {
            if (budgetId.equals(b.getId())) {
                throw new IllegalArgumentException("Budget ID already exists!");
            }
        }

        this.expenses = expenses;
        this.income = income;
        this.budget = budget;
    }


    // methods
    public int addExpense(int amount) {
    }


    public void getMonthlySpending() {

    }


    public double calculateSavingsRate() {

    }


    public void predictNextMonth() {

    }


    public void getBudgetStatus() {

    }


    public void findSpendingPatterns() {

    }


    // Getters
    public List<Expense> getExpenses() { return expenses; }
    public List<Income> getIncome() { return income; }
    public List<Budget> getBudget() { return budget; }

    public int getBalance() { return balance; }
    public String getId() { return id; }
}
