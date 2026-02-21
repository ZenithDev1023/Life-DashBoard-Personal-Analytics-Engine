package model.finance;

import java.time.LocalDate;

import utils.validation.ValidateFinance;

public class Income {
    // Fields
    private String id = "UNASSIGNED";
    private double amount = 0.0;
    private String source = "UNASSIGNED";
    private LocalDate date = null;
    private boolean recur = true;

    // Constructor
    public Income(
        String id,
        double amount,
        String source,
        LocalDate date,
        boolean recur
    ) {
        ValidateFinance.validateId(id);
        ValidateFinance.validateAmount(amount);
        ValidateFinance.validateSource(source);
        ValidateFinance.validateDate(date);
        ValidateFinance.validateRecur(recur);

        this.id = id;
        this.amount = amount;
        this.source = source;
        this.date = date;
        this.recur = recur;
    }



    // Getters
    public String getId() { return id; }
    public double getAmount() { return amount; }
    public String getSource() { return source; }
    public LocalDate getDate() { return date; }
    public boolean getRecur() { return recur; }

    // Setters
    public void setId(String id) { this.id = id; }
    public void setAmount(double amount) { this.amount = amount; }
    public void setSource(String source) { this.source = source; }
    public void setDate(LocalDate date) { this.date = date; }
    public void setRecur(boolean recur) { this.recur = recur; }

    @Override
    public String toString() {
        return String.format(
            "ID: %s, Amount: %.2f, Source: %s, Date: %s, recur: %b",
            id, amount, source, date, recur
        );
    }
}
