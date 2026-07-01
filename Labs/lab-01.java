// LAB REPORT - 1

// Title: Demonstration of Inheritance Using Vehicle Class

// Problem Statement:
// A Vehicle is a superclass that contains common characteristics of all vehicles. The Vehicle class has a method named driver(), which can be accessed by all subclasses.

// There are three subclasses:
// 1. Car – contains an additional method brand().
// 2. Bus – contains an additional method engine().
// 3. Truck – contains an additional method diesel().

// All three subclasses also contain a method named wheels(). Implement a Java program to demonstrate the inheritance relationship between the Vehicle class and its three subclasses: Car, Bus, and Truck.


class Vehicle {
    void driver() {
        System.out.println("Vehicle has a driver.");
    }
}

class Car extends Vehicle {
    void brand() {
        System.out.println("Brand: Toyota");
    }

    void wheels() {
        System.out.println("Car has 4 wheels.");
    }
}

class Bus extends Vehicle {
    void engine() {
        System.out.println("Engine: Diesel Engine");
    }

    void wheels() {
        System.out.println("Bus has 6 wheels.");
    }
}

class Truck extends Vehicle {
    void diesel() {
        System.out.println("Truck uses diesel.");
    }

    void wheels() {
        System.out.println("Truck has 10 wheels.");
    }
}

public class Main {
    public static void main(String[] args) {

        Car c = new Car();
        c.driver();
        c.brand();
        c.wheels();

        System.out.println();

        Bus b = new Bus();
        b.driver();
        b.engine();
        b.wheels();

        System.out.println();

        Truck t = new Truck();
        t.driver();
        t.diesel();
        t.wheels();
    }
}