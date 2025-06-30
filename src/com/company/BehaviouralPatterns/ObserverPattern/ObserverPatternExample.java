package com.company.BehaviouralPatterns.ObserverPattern;


//Observer Interface

import java.util.ArrayList;
import java.util.List;

interface  Observer{
    void update(float temp);
}

//Subject Interface

interface Subject{
    void addObserver(Observer obs);
    void removeObserver(Observer obs);
    void notifyObservers();
}

// Weather Station which will be Concrete Subject;

class WeatherStation implements  Subject{

    private float temperature;

    private List<Observer> observerList;

    public WeatherStation(){

        this.observerList = new ArrayList<>();

    }

    @Override
    public void addObserver(Observer obs) {
        observerList.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observerList.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for(Observer obs:observerList){
            obs.update(temperature); //Run Time Polymorphism because we may have mobile observer,tablet observer and etc.
        }
    }

    public void setTemperature(float temp){
        this.temperature  = temp;

        notifyObservers();

    }
}

class  DisplayDevice implements  Observer{

    String deviceName;

    public DisplayDevice(String deviceName){
        this.deviceName = deviceName;
    }

    @Override
    public void update(float temp) {
        System.out.println("Temperature on "+deviceName +" is "+temp);
    }
}

class  MobileDevice implements  Observer{

    String deviceName;

    public MobileDevice(String deviceName){
        this.deviceName = deviceName;
    }

    @Override
    public void update(float temp) {
        System.out.println("Temperature on "+deviceName +" is "+temp);
    }
}


public class ObserverPatternExample {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        MobileDevice md  = new MobileDevice("Samsung S9");
        DisplayDevice dd = new DisplayDevice("Samsung Tablet");

        weatherStation.addObserver(md);
        weatherStation.addObserver(dd);

        weatherStation.setTemperature(88);

        weatherStation.removeObserver(md);

        weatherStation.setTemperature(90);

    }
}
