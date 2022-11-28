package enums;

public enum CarComponents {

    ENGINE("turbo", "jz2", 25000),
    STEER,
    SUSPENSION,
    BRAKE,
    RADIATOR,
    MUFFLER,
    GEARBOX;

    private String type;
    private String name;
    private int price;

    CarComponents(String type, String name, int price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    CarComponents() {

    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
