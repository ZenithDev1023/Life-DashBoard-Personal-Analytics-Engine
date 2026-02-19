package enums;

public enum MealType {
    BREAKFAST("Breakfast", 0.0),
    LUNCH("Lunch", 0.0),
    DINNER("Dinner", 0.0),
    SNACK("Snack", 0.0);

    private final String name;
    private final double time;

    MealType(String name, double time) {
        this.name = name;
        this.time = time;
    }

    public String getName() { return name; }
    public double getTime() { return time; }

    @Override
    public String toString() {
        return name + " - " + time;
    }
}
