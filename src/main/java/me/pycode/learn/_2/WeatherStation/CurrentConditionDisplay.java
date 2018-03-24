package me.pycode.learn._2.WeatherStation;

public class CurrentConditionDisplay implements DisplayElement,Observer {

    private float temp;
    private float humidity;
    private float pressure;
    private Subject subject;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.subject = weatherData;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("current condition is "+temp+", "+humidity+", "+pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
