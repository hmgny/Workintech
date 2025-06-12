package org.example.company;
import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName(){
        return name;
    }
    public int getCylinders(){
        return cylinders;
    }

    @Override
    public String toString() {
        return "Car{name='" + name + "', cylinders=" + cylinders + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, cylinders);
    }

    public String startEngine(){
        String message = "the car's engine is starting";
        System.out.println(getClass().getSimpleName() + " " + message);
        return message ;
    }
    public String accelerate(){
        String message = "the car is accelerating";
        System.out.println(getClass().getSimpleName() + " " + message);
        return message ;
    }
    public String brake(){
        String message = "the car is braking";
        System.out.println(getClass().getSimpleName() + " " + message);
        return message ;

    }
}
