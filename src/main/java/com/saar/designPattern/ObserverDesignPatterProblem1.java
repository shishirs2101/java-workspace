package com.saar.designPattern;

import java.util.LinkedList;
import java.util.List;

public class ObserverDesignPatterProblem1 {

}



// subject structure

interface  Stations{
    public void registerDevices(Devices devices);
    public void removeDevice(Devices devices);
    public void sentNotification(int temperature,int humidity,int pressure);
}

abstract class WeatherStation implements Stations{
    final static List<Devices> registeredDevices = new LinkedList<>();

    
    @Override
    public void registerDevices(Devices devices) {
        registeredDevices.add(devices);
    }

    @Override
    public void removeDevice(Devices devices) {
        registeredDevices.remove(devices);
    }

    @Override
    public void sentNotification(int temperature,int humidity,int pressure) {
        registeredDevices.forEach(devices -> {
            devices.setWeatherParams(temperature,humidity,pressure);
        });
    }
}

class KanpurWeatherStation {

}

class BangaloreWeatherStation{}



// Observer Structure 

interface Devices {
    public void displayTemperature();
    public void displayPressure();
    public void displayHumidity();
    public void setWeatherParams(int temperature,int humidity,int pressure);
}

abstract class WeatherDevices implements Devices{
    private int temperature;
    private int pressure;
    private int humidity;

    @Override
    public void setWeatherParams(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void displayTemperature() {
        System.out.println("Temperature: "+temperature);
    }

    @Override
    public void displayHumidity() {
        System.out.println("Humidity: "+humidity);
    }

    @Override
    public void displayPressure() {
        System.out.println("Pressure: "+pressure);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}



