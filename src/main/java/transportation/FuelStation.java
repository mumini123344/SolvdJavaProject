package transportation;

public class FuelStation {
    private int stops;

    public FuelStation(int stops) {
        this.stops = stops;
    }

    @Override
    public String toString() {
        return "Car stopped at FuelStation " + stops;
    }

    public int getStops() {
        return stops;
    }

    public void setStops(int stops) {
        this.stops = stops;
    }
}
