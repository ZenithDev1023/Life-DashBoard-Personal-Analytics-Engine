package enums;

public enum Priority {
    LOW("Low", 0, 2),
    MEDIUM("Medium", 3, 5),
    HIGH("High", 6, 7),
    CRITICAL("Critical", 8, 10);

    private final String type;
    private final int minLevel;
    private final int maxLevel;

    Priority(
        String type, 
        int minLevel, 
        int maxLevel
    ) {
        this.type = type;
        this.minLevel = minLevel;
        this.maxLevel = maxLevel;
    }

    public String getType() { return type; }
    public int getMinLevel() { return minLevel; }
    public int getMaxLevel() { return maxLevel; }

    @Override
    public String toString() {
        return type + " : " + minLevel + " - " + maxLevel;
    }
}
