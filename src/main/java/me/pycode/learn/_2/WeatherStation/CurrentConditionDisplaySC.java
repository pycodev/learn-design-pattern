package me.pycode.learn._2.WeatherStation;

public class CurrentConditionDisplaySC implements DisplayElement,Observer {

    private float temp;
    private float humidity;
    private float pressure;
    private Subject subject;

    public CurrentConditionDisplaySC(WeatherData weatherData) {
        this.subject = weatherData;
        subject.registerObserver(this);
    }

    public boolean abandonListening() {
        return subject.removeObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前气候为："+temp+", "+humidity+", "+pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
