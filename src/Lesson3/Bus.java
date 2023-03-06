package Lesson3;


import Lesson2.transport.Transport;

public class Bus extends Transport<DriverD> {

    public Bus(String brand,
               String model,
               double engineVolume,
               DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус марки" + getBrand() + "Начал движение");

    }
   @Override
    public void finishMoving() {
        System.out.println("Автобус марки" + getBrand() + "Закончил  движение");

    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автобуса");
    }

    @Override
    public void theBestTime() {
        int minBound=100;
        int maxBound=150;
        int theBestTimeInMins = (int)(maxBound+ (maxBound-minBound)*Math.random());
        System.out.println("Лучшее время круга для автобуса в минутах : "+ theBestTimeInMins);
    }

    @Override
    public void maxSpeed() {
        int minBound=80;
        int maxBound=120;
        int maxSpeed = (int)(maxBound+ (maxBound-minBound)*Math.random());
        System.out.println("Лучшее время круга для автобуса"+ maxSpeed);
    }
}