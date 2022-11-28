package transportation;

import enums.Gender;

import lambdas.ICarMoving;
import people.Driver;
import people.Passenger;


import java.util.*;
import java.util.function.Predicate;

import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main{

    private static final Logger LOGGER = LogManager.getLogger(Main.class.getName());
    public static void main(String[] args) throws Exception {


        Predicate<Passenger> pr = e -> e.getAge() > 20;

        Passenger alex = new Passenger(12312312415L, "Alex", "Melson", 25,  Gender.MALE);
        Passenger brian =  new Passenger(123142143567L, "Brian", "Newton", 36, Gender.MALE);
        Passenger charles = new Passenger(531232131555L, "Charles", "Vazovski", 27, Gender.MALE);
        Passenger edward = new Passenger(645634423432L, "Edward", "Mackens", 23, Gender.MALE);


        List<Passenger> passengers = new ArrayList<>();
        passengers.add(alex);
        passengers.add(brian);
        passengers.add(charles);
        passengers.add(edward);


        //Lambda
        Collections.sort(passengers, new Comparator<>() {
            @Override
            public int compare(Passenger passenger1, Passenger passenger2) {
                return passenger1.getFirstName().compareTo(passenger2.getFirstName());
            }
        });

        for (Passenger passenger : passengers){
            LOGGER.info(passenger.getFirstName());
        }

        for (Passenger passenger : passengers){
            LOGGER.info(passenger.toString());
        }

        Predicate<String> s = i -> (i.length()>4);
        LOGGER.info(s.test("Passengers"));

        String names[] = {"Alex", "Brian", "Charles", "Edward"};
        for (String name : names){
            if (s.test(name)) {
                LOGGER.info(name);
            }
        }

        ICarMoving carMoving = (String from, String destination) ->
            {LOGGER.info("Car moving from " + from + " to " + destination);
            return  ("Price 1500$");};
        LOGGER.info(carMoving.CarMoving("Germany", "Tbilisi"));

        //Streams
        List<String > vehicles = Arrays.asList("bus", "car", "bicycle", "plane", "train");
        List<String> vehiclesListInUpperCase = new ArrayList<>();

        vehiclesListInUpperCase  = vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
        LOGGER.info(vehiclesListInUpperCase);

        vehicles.stream().map(vname -> vname.length()).forEach(len -> LOGGER.info(len));

        List<Integer> numbesList = Arrays.asList(2, 3, 4, 5, 6);
        List<Integer> mulList = new ArrayList<>();

        numbesList.stream().map(num -> num * 3).forEach(num -> LOGGER.info(num));


        //New car objects
        Car car = new Car();
        Bus bus = new Bus();
        Motorbike bike = new Motorbike();



        //Creates space between lines
        System.out.println();

        //Other Classes
        Luggage luggage = new Luggage(3, 30 , "Bag");

        PlaceLocations placeLocations = new PlaceLocations();
        placeLocations.setPlaceA("Tbilisi");
        placeLocations.setPlaceB("Batumi");

        Weather weather = new Weather("Sunny");

        FuelStation fuelStation = new FuelStation(3);

        CompanyName name = new CompanyName();
        name.setNameOfCompany("'Transport with Supercars'");

        CarStation carStation = new CarStation();
        carStation.setCarStationName("Tbilisi Supercars station");
        carStation.setCarStationCapacity(50);
        carStation.setCarStationLocation("Tbilisi");
        carStation.setSponsor("Japan");



        LOGGER.info("-----Polymorphism-----");
        // Polymorphism
        Vehicle[] transports = {car, bus, bike};
        for (Vehicle i : transports){
            i.go();

        }


        // Equals and hashcode
        Tickets ticketOne = new Tickets(15,3);
        Tickets ticketTwo = new Tickets(30,0);
        Tickets ticketThree = new Tickets(15, 3);

        Car carOne = new Car("Sedan", "Rb25", "blue", "Nissan GT-R r35", "4",
                "gas", 270, 4,
                new Driver("noe", "Vu", 30, "Male"));
        Car carTwo = new Car("Sedan", "2Jz", "Black", "Supra", "2", "Gas",
                250, 4);

        Driver driverOne = new Driver ("John", "Senna", 35, "Male");
        Driver driverTwo = new Driver(1241215155L, "Roy", "Charles", 20,"Male");

        //equals
        //Only works with this String.valueOf method
        LOGGER.info("----tickets----");
        LOGGER.info(ticketOne.equals(ticketTwo));
        LOGGER.info(ticketOne.equals(ticketThree));
        LOGGER.info(ticketTwo.equals(ticketThree));

        LOGGER.info("----cars----");
        LOGGER.info(carOne.equals(carTwo));

        LOGGER.info("----drivers----");
        LOGGER.info(driverOne.equals(driverTwo));

        //hashcode
        LOGGER.info("----tickets----");
        LOGGER.info(ticketOne.hashCode());
        LOGGER.info(ticketTwo.hashCode());
        LOGGER.info(ticketThree.hashCode());

        LOGGER.info("----cars----");
        LOGGER.info(carOne.hashCode());
        LOGGER.info(carTwo.hashCode());

        LOGGER.info("----driver----");
        LOGGER.info(driverOne.hashCode());
        LOGGER.info(driverTwo.hashCode());


        LOGGER.info("Car moving from " + placeLocations.getPlaceA() + " to " + placeLocations.getPlaceB());
        LOGGER.info(luggage);
        LOGGER.info("The weather is " + weather);
        LOGGER.info(fuelStation + " times");
        LOGGER.info("The company name is: " + name.getNameOfCompany());
        LOGGER.info("Car station name is " + carStation.getCarStationName());
        LOGGER.info("Cat station can storage up to " + carStation.getCarStationCapacity());
        LOGGER.info("Station's starting location is : " + carStation.getCarStationLocation());
        LOGGER.info("Sponsor is: " + carStation.getSponsor());





    }


}


