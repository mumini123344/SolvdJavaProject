package transportation;



public class Luggage {
    private int amount;
    private int weight;
    private String typeOfLuggage;

    public Luggage(int amount, int weight, String typeOfLuggage) {
        this.amount = amount;
        this.weight = weight;
        this.typeOfLuggage = typeOfLuggage;

    }

    public Luggage() {

    }

    @Override
    public String toString() {
        return "Luggage{" +
                "amount=" + amount +
                ", weight=" + weight + "Kg" +
                ", typeOfLuggage='" + typeOfLuggage + '\'' +
                '}';
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getTypeOfLuggage() {
        return typeOfLuggage;
    }

    public void setTypeOfLuggage(String typeOfLuggage) {
        this.typeOfLuggage = typeOfLuggage;
    }

}
