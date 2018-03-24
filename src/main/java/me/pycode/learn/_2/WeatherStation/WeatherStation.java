package me.pycode.learn._2.WeatherStation;

/**
 * test class
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay display1 = new CurrentConditionDisplay(weatherData);
        CurrentConditionDisplaySC display2 = new CurrentConditionDisplaySC(weatherData);
        weatherData.setMeasurements(1,1,1);
        weatherData.setMeasurements(2,2,2);
        display2.abandonListening();
        weatherData.setMeasurements(3,3,3);
    }
}
