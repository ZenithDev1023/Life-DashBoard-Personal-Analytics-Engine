package service.finance;

import model.finance.*;

import java.util.List;
import java.util.ArrayList;

public class FinanceService {
    private List<Expense> expenses = new ArrayList<>();
    private List<Income> income = new ArrayList<>();
    private List<Budget> budget = new ArrayList<>();

    public FinanceService(
        List<Expense> expenses,
        List<Income> income,
        List<Budget> budget
    ) {
        this.expenses = expenses;
        this.income = income;
        this.budget = budget;
    }


    // methods
    public void addExpense() {

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
}
