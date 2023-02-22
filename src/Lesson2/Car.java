package Lesson2;

import Lesson2.transport.Transport;

public class Car extends Transport {



    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private int capasity;
    private boolean summerTyres;
    private Key key;

    public static class Key {

        private final boolean remoteRun;
        private final boolean withoutAccess;

        public Key(boolean remoteRun, boolean withoutAccess) {
            this.remoteRun = remoteRun;
            this.withoutAccess = withoutAccess;
        }

        public boolean isRemoteRun() {
            return remoteRun;
        }

        public boolean isWithoutAccess() {
            return withoutAccess;
        }

        @Override
        public String toString() {
            return (remoteRun ? "удаленный запуск Двиг." : "без удаленного запуска Двиг.") + "," +
                    (withoutAccess ? "бесключевой доступ" : "бесключевой доступ отсутствует");
        }
    }

    public Car(String brand,
               String model,
               String color,

               String country,

               int publishingYear,
               int speedMaxMove,
               double engineVolume,
               String transmission,
               String bodyType,
               String regNumber,
               int capasity,
               boolean summerTyres,
               Key key) {

      super(brand,model,publishingYear,country,color,speedMaxMove);

      setEngineVolume(engineVolume);

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
        setKey(key);
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
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
        if (month >= 4 && month <= 10) {
            summerTyres = true;
        }


    }

    @Override
    public String toString() {

        return super.toString()+ "Car{" +

                ", engineVolume=" + engineVolume +

                ",коробка передач='" + transmission + '\'' +
                ", тип кузова='" + bodyType + '\'' +
                ", регистрационный номер: '" + regNumber + '\'' +
                ",кол-во мест  :'" + capasity + '\'' +
                (summerTyres ? "Летняя" : "Зимняя") + " резина" + "," + key + "}";

    }
}
