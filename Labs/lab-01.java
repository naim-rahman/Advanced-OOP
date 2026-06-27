// LAB REPORT - 1

// Title: Demonstration of Inheritance and Runtime Polymorphism Using Vehicle Class

// Problem Statement:
// A Vehicle is a superclass that contains common characteristics of all vehicles. The Vehicle class has a method named driver(), which can be accessed by all subclasses.

// There are three subclasses:
// 1. Car – contains an additional method brand().
// 2. Bus – contains an additional method engine().
// 3. Truck – contains an additional method diesel().

// All three subclasses have a common method named wheels(). Implement a Java program to demonstrate the relationship between the Vehicle class and its subclasses using inheritance and runtime polymorphism.



class Vehicle {

    void driver() {
        System.out.println("Vehicle has a driver.");
    }

    void wheels() {
        System.out.println("Vehicle has wheels.");
    }
}

// Car class
class Car extends Vehicle {

    void brand() {
        System.out.println("Brand: Toyota");
    }

    @Override
    void wheels() {
        System.out.println("Car has 4 wheels.");
    }
}

// Bus class
class Bus extends Vehicle {

    void engine() {
        System.out.println("Engine: Diesel Engine");
    }

    @Override
    void wheels() {
        System.out.println("Bus has 6 wheels.");
    }
}

// Truck class
class Truck extends Vehicle {

    void diesel() {
        System.out.println("Truck uses diesel.");
    }

    @Override
    void wheels() {
        System.out.println("Truck has 10 wheels.");
    }
}

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Bus bus = new Bus();
        Truck truck = new Truck();

        System.out.println("----- Car -----");
        car.driver();
        car.brand();
        car.wheels();

        System.out.println("\n----- Bus -----");
        bus.driver();
        bus.engine();
        bus.wheels();

        System.out.println("\n----- Truck -----");
        truck.driver();
        truck.diesel();
        truck.wheels();
    }
}