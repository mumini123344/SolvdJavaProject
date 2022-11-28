package transportation;

public class Weather {
    private String weather;

    public Weather(String weather) {
        this.weather = weather;
    }

    public Weather() {

    }

    @Override
    public String toString() {
        return weather;

    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
}
