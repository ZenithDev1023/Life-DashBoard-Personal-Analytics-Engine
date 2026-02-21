package model.finance;

import utils.validation.ValidateFinance;

public class Budget {
    // Fields
    private String id= "UNASSIGNED";
    private String name = "UNASSIGNED";
    private double limit = 0.0;
    private double spent = 0.0;
    private String period = "UNASSIGNED";

    // Constructor
    public Budget(
        String id,
        String name, 
        double limit,
        double spent,
        String period
    ) {
        ValidateFinance.validateId(id);
        ValidateFinance.validateName(name);
        ValidateFinance.validateLimit(limit);
        ValidateFinance.validateSpent(spent);
        ValidateFinance.validatePeriod(period);
        
        this.id = id;
        this.name = name;
        this.limit = limit;
        this.spent = spent;
        this.period = period;

    }



    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public double getLimit() { return limit; }
    public double getSpent() { return spent; }
    public String getPeriod() { return period; }

    // Setters
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setLimit(double limit) { this.limit = limit; }
    public void setSpent(double spent) { this.spent = spent; }
    public void setPeriod(String period) { this.period = period; }


    @Override
    public String toString() {
        return String.format(
            "ID: %s, Name: %s, Limit: %.2f, Spent: %.2f Period %s",
            id, name, limit, spent, period
        );
    }
    
}
