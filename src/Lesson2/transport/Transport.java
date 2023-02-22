package Lesson2.transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int publishingYear;

    private final String country;
    private String color;

    private int speedMaxMove;



    public Transport(String brand,
                     String model,
                     int publishingYear,
                     String country,
                     String color,
                     int speedMaxMove) {

        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;


        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;


        if ((publishingYear <= 0)) {
            publishingYear = 2000;
        }
        this.publishingYear = publishingYear;


        if (country == null || country.isEmpty()) {
            country = "default";
        }
        this.country = country;

        setColor(color);
        setSpeedMaxMove(speedMaxMove);
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

    public int getSpeedMaxMove() {
        return speedMaxMove;
    }

    public void setSpeedMaxMove(int speedMaxMove) {
        if (speedMaxMove <= 0) {
            speedMaxMove = 120;
        }


        this.speedMaxMove = speedMaxMove;
    }

    @Override
    public String toString() {

        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +

                ", color='" + color + '\'' +
                ", year=" + publishingYear +
                ", country='" + country + '\'' +
                "Максимальная скорость" + speedMaxMove + "}";

    }

}
