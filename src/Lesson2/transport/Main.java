package Lesson2.transport;

import Lesson2.Car;

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
                        "x434dgd",
                        4,
                        true );


                System.out.println(lada);
                System.out.println("---------------------------------------------------------");


                Car audi = new Car("Audi ",
                        "A8 50 L TDI quattro",
                        "black",
                        "Germany",
                        2020,
                        3.0,
                        "МКПП",
                        "sedan",
                        "x345xx777",
                        4,
                        false);



                System.out.println(audi);
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


                System.out.println(bmw);
                System.out.println("---------------------------------------------------------");

                Car kia = new Car("Kia ",
                        "Sportage",
                        "Red",
                        "South Korea",
                        2018,
                        2.4,
                        "АКПП",
                        "sedan",
                        "x988xx777",
                        4,
                        false);


                System.out.println(kia);
                System.out.println("---------------------------------------------------------");

                Car hyundai = new Car("Hyundai ",
                        "Avante",
                        "Orange",
                        "South Korea",
                        2016,
                        1.6,
                        "МКПП",
                        "sedan",
                        "x111xx655",
                        4,
                        false);



                System.out.println(hyundai);
                hyundai.changeTyres(8);
                System.out.println(hyundai);
            }


        }









