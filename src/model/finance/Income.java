package model.finance;

import java.time.LocalDate;

import utils.validation.ValidateFinance;

public class Income {
    // Fields
    private int incomeId = 0;
    private double amount = 0.0;
    private String source = "UNASSIGNED";
    private LocalDate date = null;
    private boolean recur = true;

    // Constructors
    public Income() {}

    public Income(
        int incomeId,
        double amount,
        String source,
        LocalDate date,
        boolean recur
    ) {
        ValidateFinance.validateId(incomeId);
        ValidateFinance.validateAmount(amount);
        ValidateFinance.validateSource(source);
        ValidateFinance.validateDate(date);

        this.incomeId = incomeId;
        this.amount = amount;
        this.source = source;
        this.date = date;
        this.recur = recur;
    }



    // Getters
    public int getId() { return incomeId; }
    public double getAmount() { return amount; }
    public String getSource() { return source; }
    public LocalDate getDate() { return date; }
    public boolean getRecur() { return recur; }

    // Setters
    public void setId(int incomeId) { this.incomeId = incomeId; }
    public void setAmount(double amount) { this.amount = amount; }
    public void setSource(String source) { this.source = source; }
    public void setDate(LocalDate date) { this.date = date; }
    public void setRecur(boolean recur) { this.recur = recur; }

    @Override
    public String toString() {
        return String.format(
            "ID: %d, Amount: %.2f, Source: %s, Date: %s, recur: %b",
            incomeId, amount, source, date, recur
        );
    }
}
