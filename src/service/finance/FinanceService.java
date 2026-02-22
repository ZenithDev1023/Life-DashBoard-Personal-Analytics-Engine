package service.finance;

import model.finance.*;

import java.util.List;

import enums.CategoryType;

import java.time.LocalDate;
import java.util.ArrayList;

public class FinanceService {
    private List<Expense> expenses = new ArrayList<>();
    private List<Income> income = new ArrayList<>();
    private List<Budget> budget = new ArrayList<>();

    Expense e = new Expense();
    int expenseId = e.getId();

    Income in = new Income();
    int incomeId = in.getId();

    Budget b = new Budget();
    int budgetId = b.getId();


    private int balance;


    public FinanceService() {}
    

    public FinanceService(
        List<Expense> expenses,
        List<Income> income,
        List<Budget> budget
    ) {
        for (int i = 0; i < expenses.size(); i++) {
            if (expenseId == b.getId()) {
                throw new IllegalArgumentException("Expense ID already exists!");
            }
        }
        for (int i = 0; i < income.size(); i++) {
            if (incomeId == in.getId()) {
                throw new IllegalArgumentException("Income ID already exists!");
            }
        }
        for (int i = 0; i < budget.size(); i++) {
            if (budgetId == b.getId()) {
                throw new IllegalArgumentException("Budget ID already exists!");
            }
        }

        this.expenses = expenses;
        this.income = income;
        this.budget = budget;
    }


    // methods
    public Expense addExpense(int expenseId, double amount, CategoryType category, LocalDate date, String description) {
        Expense expense = new Expense(expenseId, amount, category, date, description);
        return expense;
    }

    public Income addIncome(int id, double amount, String source, LocalDate date, boolean recur) {
        Income income = new Income(id, amount, source, date, recur);
        return income;
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
}
