package transportation;

import java.util.Objects;


public class Tickets {
    private int price;
    private int amount;

    public Tickets(int price, int amount) {
        this.price = price;
        this.amount = amount;
    }

    public Tickets() {

    }

//    @Override


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tickets)) return false;
        Tickets tickets = (Tickets) o;
        return getPrice() == tickets.getPrice() && getAmount() == tickets.getAmount();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice(), getAmount());
    }

    @Override
    public String toString() {
        return "Tickets{" +
                "price=" + price + "$" +
                ", amount=" + amount +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
