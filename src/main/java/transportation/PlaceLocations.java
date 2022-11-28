package transportation;

public class PlaceLocations {
    private String placeA;
    private String placeB;

    public PlaceLocations(String placeA, String placeB) {
        this.placeA = placeA;
        this.placeB = placeB;
    }

    public PlaceLocations() {

    }

    @Override
    public String toString() {
        return "PlaceLocations{" +
                "placeA='" + placeA + '\'' +
                ", placeB='" + placeB + '\'' +
                '}';
    }

    public String getPlaceA(){
        return placeA;
    }
    public void setPlaceA(String placeA){
        this.placeA = placeA;
    }
    public String getPlaceB(){
        return placeB;
    }
    public void setPlaceB(String placeB){
        this.placeB = placeB;

    }

}
