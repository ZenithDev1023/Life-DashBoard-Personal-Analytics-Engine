package enums;

public enum WeekDay {
    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    private final String title;
    private final int weekDay;

    WeekDay (
        String title, 
        int weekDay
    ) {
        this.title = title;
        this.weekDay = weekDay;
    }

    public String getTitle() { return title; }
    public int getWeekDay() { return weekDay; }

    @Override
    public String toString() {
        return title + " - " + weekDay;
    }
}
