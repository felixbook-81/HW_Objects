package Lesson2.transport;

public class Car {
    private final String brand;
    private final String model;
    private String color;
    private final String country;
    private final int publishingYear;
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private int capasity;
    private boolean summerTyres;

    public Car(String brand,
               String model,
               String color,
               String country,
               int publishingYear,
               double engineVolume,
               String transmission,
               String bodyType,
               String regNumber,
               int capasity,
               boolean summerTyres) {


        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;

        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;

        setEngineVolume(engineVolume);

        setColor(color);

        if (country == null || country.isEmpty()) {
            country = "default";
        }
        this.country = country;


        if ((publishingYear <= 0)) {
            publishingYear = 2000;
        }
        this.publishingYear = publishingYear;


        setTransmission(transmission);

        if (bodyType == null || bodyType.isEmpty()) {
            bodyType = "sedan";
        }
        this.bodyType = bodyType;

        setRegNumber(regNumber);
        if (capasity <= 0) {
            capasity = 5;
        }
        this.capasity = capasity;
        this.summerTyres = summerTyres;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()) {
            transmission = "МКПП";
        }
        this.transmission = transmission;
    }

    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            color = "Белый";
        }
        this.color = color;
    }

    public String getCountry() {
        return country;
    }


    public int getPublishingYear() {
        return publishingYear;
    }

    public double getEngineVolume() {
        return engineVolume;

    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }

        this.engineVolume = engineVolume;
    }

    public int getCapasity() {
        return capasity;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null || regNumber.isEmpty()) {
            regNumber = "x000xx000";
        }
        this.regNumber = regNumber;
    }

    public boolean isSummerTyres(boolean summerTyres) {


        return summerTyres;
    }
    public void changeTyres(int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3)) {
            summerTyres = false;
        }


    }

    @Override
    public String toString() {

        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + publishingYear +
                ", country='" + country + '\'' +
                ",коробка передач='" + transmission + '\'' +
                ", тип кузова='" + bodyType + '\'' +
                ", регистрационный номер: '" + regNumber + '\'' +
                ",кол-во мест  :'" + capasity + '\'' +
                (summerTyres ? "Летняя" : "Зимняя") + " резина" + "}";

    }
}
