package enums;

public enum DaysOfTheWeek {
    Monday(1, false),
    Tuesday(2, false),
    Wednesday(3, false),
    Thursday(4, false),
    Friday(5, false),
    Saturday(6, true),
    Sunday(7, true);

    private final int order;
    private final boolean weekDay;

    DaysOfTheWeek(int order, boolean weekDay) {
        this.order = order;
        this.weekDay = weekDay;
    }

    public int getOrder() {
        return order;
    }

    public boolean isWeekDay() {
        return weekDay;
    }
}
