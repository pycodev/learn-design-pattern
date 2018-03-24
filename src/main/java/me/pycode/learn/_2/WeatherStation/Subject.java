package me.pycode.learn._2.WeatherStation;

public interface Subject {

    void registerObserver(Observer observer);

    boolean removeObserver(Observer observer);

    void notifyObservers();
}
