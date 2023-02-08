package Lesson2;

public class Auto {
    private String brand;
    private String model;
    private String color;
    private String country;
    private int publishingYear;
    private double engineVolume;

    public Auto(String brand, String model, String color, String country, int publishingYear, double engineVolume) {

        this.brand = (brand == null || brand == ""? "default": brand);
        this.model = (model == null || model == ""? "default": model);
        this.color = (color == null || color == ""? "default": color);
        this.country = (country == null || country == ""? "default": country);
        this.publishingYear = (publishingYear<=0? 2000: publishingYear);
        this.engineVolume = engineVolume;
    }


            public String getBrand () {
                return brand;
            }

            public void setBrand (String brand){
                this.brand = brand;
            }

            public String getModel () {
                return model;
            }

            public void setModel (String model){
                this.model = model;
            }


            public String getColor () {
                return color;
            }

            public void setColor (String color){
                this.color = color;
            }

            public String getCountry () {
                return country;
            }

            public void setCountry (String country){
                this.country = country;
            }

            public int getPublishingYear () {
                return publishingYear;
            }

            public void setPublishingYear ( int publishingYear){
                this.publishingYear = publishingYear;
            }

            public double getEngineVolume () {
                return engineVolume;

            }

            public void setEngineVolume ( double engineVolume){
                this.engineVolume = engineVolume;
            }

            @Override
            public String toString () {

                return "Car{" +
                        "brand='" + brand + '\'' +
                        ", model='" + model + '\'' +
                        ", engineVolume=" + engineVolume +
                        ", color='" + color + '\'' +
                        ", year=" + publishingYear +
                        ", country='" + country + '\'' +
                        '}';
            }
        }
