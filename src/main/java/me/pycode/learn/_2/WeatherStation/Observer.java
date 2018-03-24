package me.pycode.learn._2.WeatherStation;

public interface Observer {
    // 温度、湿度、气压
    void update(float temp,float humidity, float pressure);
}
