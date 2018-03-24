package me.pycode.learn._2.WeatherStation;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    List<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    public void setMeasurements(float temp,float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        meassurementsChanged();
    }

    public void meassurementsChanged(){
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public boolean removeObserver(Observer observer) {
        return observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach((o)->{o.update(temp,humidity,pressure);});
    }
}
