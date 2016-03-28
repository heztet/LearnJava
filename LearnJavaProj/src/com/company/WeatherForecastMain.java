package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class WeatherForecastMain {
    public static void main(String[] args) {
        WeatherForecaster forecaster = new WeatherForecaster();

        // List of days in a week
        ArrayList<String> days = new ArrayList<String>();
        Collections.addAll(days, "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");

        System.out.println("Weather forecast for the next week:");
        for(String day : days) {
            String weatherForecast = forecaster.forecastWeather();
            int temperatureForecast = forecaster.forecastTemperature();

            System.out.printf("%s: %s %s\n", day, weatherForecast, temperatureForecast);
        }
    }
}
