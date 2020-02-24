package com.company.observer.chellenge;

public class WeatherStationDemo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        AlertSystem alertSystem = new AlertSystem(weatherStation);
        Logger logger = new Logger(weatherStation);
        UserInterface userInterface = new UserInterface(weatherStation);

        weatherStation.setPressure(90);
        weatherStation.setTemperature(24);
        weatherStation.setWindSpeed(10);

        alertSystem.alert();
        logger.log();
        userInterface.display();

        weatherStation.setWindSpeed(20);

        alertSystem.alert();
        logger.log();
        userInterface.display();
    }
}
