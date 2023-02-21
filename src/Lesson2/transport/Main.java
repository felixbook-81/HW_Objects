package Lesson2.transport;

import Lesson2.transport.Car;

public class Main {
    public static void main(String[] args) {


                Car lada = new Car("Lada ",
                        "Granta",
                        "yellow",
                        "Russia",
                        2015,
                        1.7,
                        "АКПП",
                        "sedan",
                        "x000xxx",
                        4,
                        true );

                System.out.println("Автомобиль- " + lada.getBrand() + lada.getModel());
                System.out.println("Цвет - " + lada.getColor());
                System.out.println("Сборка в  " + lada.getCountry());
                System.out.println(lada.getPublishingYear() + "   год выпуска");
                System.out.println("Обьем двигателя - " + +lada.getEngineVolume());

                System.out.println("---------------------------------------------------------");


                Car audi = new Car("Audi ",
                        "A8 50 L TDI quattro",
                        "black",
                        "Germany",
                        2020,
                        3.0,
                        "МКПП",
                        "sedan",
                        "x000xx000",
                        4,
                        false);

                System.out.println("Автомобиль - " + audi.getBrand() + audi.getModel());
                System.out.println("Цвет - " + audi.getColor());
                System.out.println("Сборка -  " + audi.getCountry());
                System.out.println("Год выпуска - " + audi.getPublishingYear());
                System.out.println("Обьем двигателя - " + +audi.getEngineVolume());


                System.out.println("---------------------------------------------------------");

                Car bmw = new Car("BMW ",
                        "Z8",
                        "black",
                        "Germany",
                        2020,
                        3.0,
                        "МКПП",
                        "sedan",
                        "x000xx000",
                        4,
                        false);

                System.out.println("Автомобиль- " + bmw.getBrand() + bmw.getModel());
                System.out.println("Цвет - " + bmw.getColor());
                System.out.println("Сборка -  " + bmw.getCountry());
                System.out.println("Год выпуска - " + bmw.getPublishingYear());
                System.out.println("Обьем двигателя - " + +bmw.getEngineVolume());

                System.out.println("---------------------------------------------------------");

                Car kia = new Car("Kia ",
                        "Sportage",
                        "Red",
                        "South Korea",
                        2018,
                        2.4,
                        "АКПП",
                        "sedan",
                        "x000xx000",
                        4,
                        false);

                System.out.println("Автомобиль- " + kia.getBrand() + kia.getModel());
                System.out.println("Цвет - " + kia.getColor());
                System.out.println("Сборка -  " + kia.getCountry());
                System.out.println("Год выпуска - " + kia.getPublishingYear());
                System.out.println("Обьем двигателя - " + +kia.getEngineVolume());

                System.out.println("---------------------------------------------------------");

                Car hyundai = new Car("Hyundai ",
                        "Avante",
                        "Orange",
                        "South Korea",
                        2016,
                        1.6,
                        "МКПП",
                        "sedan",
                        "x000xx000",
                        4,
                        false);

                System.out.println("Автомобиль- " +hyundai.getBrand() + hyundai.getModel());
                System.out.println("Цвет - " + hyundai.getColor());
                System.out.println("Сборка в  " + hyundai.getCountry());
                System.out.println("Год выпуска - " + hyundai.getPublishingYear());
                System.out.println("Обьем двигателя - " + hyundai.getEngineVolume());

                System.out.println(hyundai);
            }


        }









