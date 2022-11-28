package people;

import enums.Gender;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import transportation.Main;


public  class Passenger extends Person{
    private static final Logger LOGGER = LogManager.getLogger(Passenger.class.getName());
    public Passenger(long id, String firstName, String lastName, int age, String gender) {
        super(id, firstName, lastName, age, gender);
    }

    public Passenger(long id, String firstName, String lastName, int age, Gender gender){
        super(id, firstName, lastName, age, String.valueOf(gender));
    }


    @Override
    public String toString() {
        return super.toString() ;
    }

    public Passenger() {
    }





}




