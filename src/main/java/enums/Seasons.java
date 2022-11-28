package enums;

public enum Seasons {
    spring(1, "Rainy" ),
    summer(2, "Sunny"),
    fall(3, "Windy"),
    winter(4, "Snowy");

    private final int order;
    private final String weather;

    Seasons(int order, String weather) {
        this.order = order;
        this.weather = weather;
    }

    public String getWeather() {
        return weather;
    }

    public int getOrder() {
        return order;
    }
}
