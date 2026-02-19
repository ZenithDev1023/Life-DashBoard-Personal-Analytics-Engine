package enums;

public enum CategoryType {
    FOOD("Food", ""),
    TRANSPORT("Transport", ""),
    ENTERTAINMENT("Entertainment", ""),
    UTILITIES("Utilities", ""),
    SHOPPING("Shopping", ""),
    EDUCATION("Education", ""),
    SAVINGS("Savings", "");

    private final String name;
    private final String description;

    CategoryType(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    

    @Override
    public String toString() {
        return name + " - " + description;
    }
}
