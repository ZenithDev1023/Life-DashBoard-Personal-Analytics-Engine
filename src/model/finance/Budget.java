package model.finance;

import utils.validation.ValidateFinance;

public class Budget {
    // Fields
    private int budgetId = 0;
    private String name = "UNASSIGNED";
    private double limit = 0.0;
    private double spent = 0.0;
    private String period = "UNASSIGNED";

    // Constructors
    public Budget() {}


    public Budget(
        int budgetId,
        String name, 
        double limit,
        double spent,
        String period
    ) {
        ValidateFinance.validateId(budgetId);
        ValidateFinance.validateName(name);
        ValidateFinance.validateLimit(limit);
        ValidateFinance.validateSpent(spent);
        ValidateFinance.validatePeriod(period);
        
        this.budgetId = budgetId;
        this.name = name;
        this.limit = limit;
        this.spent = spent;
        this.period = period;

    }



    // Getters
    public int getId() { return budgetId; }
    public String getName() { return name; }
    public double getLimit() { return limit; }
    public double getSpent() { return spent; }
    public String getPeriod() { return period; }

    // Setters
    public void setId(int budgetId) { this.budgetId = budgetId; }
    public void setName(String name) { this.name = name; }
    public void setLimit(double limit) { this.limit = limit; }
    public void setSpent(double spent) { this.spent = spent; }
    public void setPeriod(String period) { this.period = period; }


    @Override
    public String toString() {
        return String.format(
            "ID: %d, Name: %s, Limit: %.2f, Spent: %.2f Period %s",
            budgetId, name, limit, spent, period
        );
    }
    
}
