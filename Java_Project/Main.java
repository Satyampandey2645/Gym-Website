import java.util.*;
import java.io.*;

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting car engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping car engine");
    }
}

class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting motorcycle engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping motorcycle engine");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();

        Vehicle motorcycle = new Motorcycle();
        motorcycle.start();
        motorcycle.stop();
    }
}