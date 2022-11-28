package people;

import interfaces.IBreath;
import interfaces.IWalk;
import people.Person;

import java.util.logging.Logger;


public class Driver extends Person implements IWalk, IBreath {
    private final static Logger LOGGER = Logger.getLogger(String.valueOf(Driver.class));
    public Driver(long id, String firstName, String lastName, int age, String gender) {
        super(id, firstName, lastName, age, gender);

    }
//driver1 constructor
    public Driver(String firstName, String lastName, int age, String gender) {

    }

    public Driver() {

    }


    @Override
    public void breath() {
        System.out.println("Driver is breathing");

    }

    @Override
    public void walk() {
        System.out.println("Driver is walking");

    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }


}


