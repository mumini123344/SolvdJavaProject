package enums;

public enum Planets {
    Mercury(1, 3.303e+23, 2439.7, 3.7),
    Venus(2, 4.869e+24, 6051.8, 8.87),
    Earth(3, 5.976e+24, 6371, 9.807),
    Mars(4, 6.421e+23, 3389.5, 3.721),
    Jupiter(5, 1.9e+27, 69911, 24.79),
    Saturn(6, 5.688e+26, 58232, 10.44),
    Uranus(7, 8.686e+25, 25362, 8.87),
    Neptune(8, 1.024e+26, 24622, 11.15);

    private final int order;
    private final double mass;
    private final double radius;
    private final double gravity;

    Planets(int order, double mass, double radius, double gravity) {
        this.order = order;
        this.mass = mass;
        this.radius = radius;
        this.gravity = gravity;
    }

    public int getOrder() {
        return order;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double getGravity() {
        return gravity;
    }
}
