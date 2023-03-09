package Lesson2.transport;


import Lesson3.Driver;

public abstract class Bus extends Transport {


    public Bus(String brand,
               String model,
               double engineVolume,
               Driver driver) {
        super(brand, model, engineVolume, driver);
    }
}
