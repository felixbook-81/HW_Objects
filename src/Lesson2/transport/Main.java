package Lesson2.transport;

import Lesson2.Car;

public class Main {
    public static void main(String[] args) {


        Car lada = new Car("Lada ",
                "Granta",
                "yellow",
                "Russia",
                2015,
                250,
                1.7,
                "sedan",
                "sedan",
                "x434dgd",
                4,
                true,
                new Car.Key(true, false));

        System.out.println(lada);
        System.out.println("---------------------------------------------------------");


        Car audi = new Car("Audi ",
                "A8 50 L TDI quattro",
                "black",
                "Germany",
                2020,
                280,
                2.5,
                "МКПП",
                "sedan",
                "x999xx777",
                4,
                true,

                new Car.Key(true, true));


        System.out.println(audi);
        System.out.println("---------------------------------------------------------");

        Car bmw = new Car("BMW ",
                "Z8",
                "black",
                "Germany",
                2005,
                330,
                2.3,
                "AКПП",
                "sedan",
                "x988xx777",
                4,
                true,
                new Car.Key(true, false));
        System.out.println(bmw);
        System.out.println("---------------------------------------------------------");

        Car kia = new Car("Kia ",
                "Sportage",
                "Red",
                "South Korea",
                2018,
                190,
                3.0,
                "MKПП",
                "sedan",
                "x988xx777",
                4,
                false,
                new Car.Key(true, false));


        System.out.println(kia);
        System.out.println("---------------------------------------------------------");

        Car hyundai = new Car("Hyundai ",
                "Avante",
                "Orange",
                "South Korea",
                2016,
                210,
                3.3,
                "МКПП",
                "sedan",
                "x988xx777",
                4,
                true,
                new Car.Key(false, true));


        System.out.println(hyundai);

        for (int i = 1; i <= 3; i++) {
            Bus bus = new Bus(
                    "Bus brend №" + i,
                    "Bus model №" + i,
                    2015 + i,
                    "Россия",
                    "Желтый",
                    110);


            System.out.println(bus);
        }


    }

}







