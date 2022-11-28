package people;

import exceptions.ThrowNegativeAgeException;
import exceptions.ThrowWrongGenderException;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import transportation.Main;

import java.util.Objects;



public abstract class Person {
    private static final Logger LOGGER = LogManager.getLogger(Person.class.getName());
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    public Person(long id, String firstName, String lastName, int age, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public Person(){

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getId() == person.getId() && getAge() == person.getAge() && getFirstName().equals(person.getFirstName())
                && getLastName().equals(person.getLastName()) && getGender().equals(person.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getAge(), getGender());
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)throws Exception {
        // this method should have age more than
        this.age = age;
        try{
            LOGGER.info("Enter you age");
            if (age < 0){
                LOGGER.info("age cannot be less then a zero");
                throw new ThrowNegativeAgeException();
            }
            else {
                LOGGER.info("Your age is: " + age);
            }
        }
        catch (ThrowNegativeAgeException e) {
            LOGGER.info("Answer should be more than 0");
        }
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) throws Exception{
        // there should be genders male and female and
        // i ll use if loop for that, how to do i ll figure out
        this.gender = gender;
            try {
                LOGGER.info("Are you male or female? ");
                LOGGER.info("\"male\" for male and \"female\" for female");
                if (gender.equals("male")) {
                    LOGGER.info("You are Male");
                } else if (gender.equals("female")) {
                    LOGGER.info("You are female");
                } else if (gender.equals(" ")) {
                    throw new ThrowWrongGenderException();
                } else {
                    LOGGER.info("You should only enter Male or Female");
                }
            }
            catch (ThrowWrongGenderException e) {
                LOGGER.info("Answer should be only genders");
            }
        }



}
