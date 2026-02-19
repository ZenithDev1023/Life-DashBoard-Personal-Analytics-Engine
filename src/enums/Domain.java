package enums;

public enum Domain {
    FINANCE("Finance"),
    HEALTH("Health"),
    LEARNING("Learning"),
    RELATIONSHIP("Relationship");

    private final String title;

    Domain(String title) {
        this.title = title;
    }

    public String getTitle() { return title; }

}
