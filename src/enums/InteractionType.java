package enums;

public enum InteractionType {
    CALL("Call"),
    TEXT("Text"),
    EMAIL("Email"),
    MEETING("Meeting"),
    SOCIAL("Social"),
    GIFT("Gift");

    private final String title;

    InteractionType(String title) {
        this.title = title;
    }

    public String getTitle() { return title; }
}
