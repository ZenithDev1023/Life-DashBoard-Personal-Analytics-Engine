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

    public StringBuilder viewExpense(int id) {
        StringBuilder sb = new StringBuilder();

        for (Expense e : expenses) {
            if (e.getId() == id) {
                sb.append(id).append(", ")
                .append(e.getAmount()).append(", ")
                .append(e.getCategoryType()).append(", ")
                .append(e.getDate()).append(e.getDescription())
                .append("\n");
            }
        }
        return sb;
    }

    public StringBuilder viewIncome(int id) {
        StringBuilder sb = new StringBuilder();

        for (Income i : income) {
            if (i.getId() == id) {
                sb.append(id).append(", ")
                .append(i.getAmount()).append(", ")
                .append(i.getSource()).append(", ")
                .append(i.getDate()).append(", ")
                .append(i.getRecur()).append("\n");
            }
        }
        return sb;
    }



    public StringBuilder getMonthlySpending(int id) {
        StringBuilder sb = new StringBuilder();

        LocalDate today = LocalDate.now();
        int currentMonth = today.getMonthValue();
        int currentYear = today.getYear();

        for (Expense expense : expenses) {
            LocalDate expenseDate = expense.getDate();

            if (expense.getId() == id && 
                expenseDate.getMonthValue() == currentMonth && 
                expenseDate.getYear() == currentYear) {
                sb.append(expense.toString()).append("\n");
            }
        }
        return sb;
    }


    public double calculateSavingsRate(int id) {

        for (Budget b : budget) {
            if (b.getId() == id) {
                if (b.getLimit() == 0) {
                    return 0;
                }

                double saved = b.getLimit() - b.getSpent();
                double savingsRate = (saved / b.getLimit()) * 100;

                return savingsRate;
            }
        }

        return 0;
    }

    public void predictNextMonth(int id) {
        for (Budget b : budget) {
            if (b.getId() == id) {
                if (b.getSpent() >= 100) {
                    double nextMonth = (b.getLimit() - b.getSpent()) - 100;
                    System.out.println("Predicted Spending next month £" + nextMonth);
                }
            }
        }
    }


    public void getBudgetStatus(int id) {
        for (Budget b : budget) {
            if (b.getId() == id) {
                if (b.getLimit() > b.getSpent()) {
                    double moneyLeft = b.getLimit() - b.getSpent() ;
                    System.out.println("Your current budget is £" + moneyLeft);
                }
                System.out.println("You have spent all your money...");
            }
            System.out.println("Account not found...");
        }

    }


    public StringBuilder findSpendingPatterns(int id) {
        StringBuilder sb = new StringBuilder();

        for (Budget b : budget) {
            if (b.getId() == id) {
                sb.append(b.getName() + ": ").append(b.getSpent()).append(", ").append(b.getPeriod()).append("\n");
            }
        }

        return sb;
    }


    // Getters
    public List<Expense> getExpenses() { return expenses; }
    public List<Income> getIncome() { return income; }
    public List<Budget> getBudget() { return budget; }
    public int getBalance() { return balance; }
}
