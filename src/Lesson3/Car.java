package Lesson3;

import Lesson2.transport.Transport;

public  class Car extends Transport<DriverB> {


    public Car(String brand,
               String model,
               double engineVolume,
               DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль марки" + getBrand() + "Начал движение");

    }
    @Override
    public void finishMoving() {
        System.out.println("Автомобиль марки" + getBrand() + "Закончил  движение");

    }
    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автомобиля");
    }

    @Override
    public void theBestTime() {
        int minBound=70;
        int maxBound=120;
        int theBestTimeInMins = (int)(maxBound+ (maxBound-minBound)*Math.random());
        System.out.println("Лучшее время круга для автомобиля в минутах : "+ theBestTimeInMins);
    }

    @Override
    public void maxSpeed() {
        int minBound=100;
        int maxBound=160;
        int maxSpeed = (int)(maxBound+ (maxBound-minBound)*Math.random());
        System.out.println("Лучшее время круга для автомобиля"+ maxSpeed);
    }
}




