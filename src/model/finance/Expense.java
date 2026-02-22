package model.finance;

import enums.CategoryType;
import java.time.LocalDate;

import utils.validation.ValidateFinance;

public class Expense {
    // Fields
    private int expenseId = 0;
    private double amount = 0.0;
    private CategoryType category = null;
    private LocalDate date = null;
    private String description = "UNASSIGNED";

    // Constructors
    public Expense() {}

    public Expense(
        int expenseId,
        double amount,
        CategoryType category,
        LocalDate date, 
        String description
    ) {
        ValidateFinance.validateId(expenseId);
        ValidateFinance.validateAmount(amount);
        ValidateFinance.validateCategory(category);
        ValidateFinance.validateDate(date);
        ValidateFinance.validateDescription(description);

        this.expenseId = expenseId;
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.description = description;
    }
    


    // Getters
    public int getId() { return expenseId; }
    public double getAmount() { return amount; }
    public CategoryType getCategoryType() { return category; }
    public LocalDate getDate() { return date; }
    public String getDescription() { return description; }

    // Setters
    public void setId(int expenseid) { this.expenseId = expenseId; }
    public void setAmount(double amount) { this.amount = amount; }
    public void setCategoryType(CategoryType category) { this.category = category; }
    public void setDate(LocalDate date) { this.date = date; }
    public void setDescription(String description) { this.description = description; }

    @Override
    public String toString() {
        return String.format(
            "ID: %d, Amount: %.2f, Category: %s, Date: %s, Description: %s",
            expenseId, amount, category, date, description
        );
    }
}
