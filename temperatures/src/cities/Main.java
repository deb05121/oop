package cities;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader br;
        String line;
        List<City> cities = new ArrayList<>();
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("textfile.txt")));

            while ((line = br.readLine()) != null) {
                String[] elements = line.split(";");

                for (String element : elements) {
                    String[] words = element.split(" ");
                    int temporary = Integer.parseInt(words[1]);
                    City newCity = new City(words[0], temporary);
                    cities.add(newCity);
                }
            }
        } catch (IOException ignored) {

        }
        System.out.println(cities);
        int maxTemporary = getMaxTempOfCities(cities);
        System.out.println("Max of temporaries of cities: " + maxTemporary);

        int minTemporary = getMinTempOfCities(cities);
        System.out.println("Min of temporaries of cities: " + minTemporary);

        int avgTemporary = getAvgTempOfCities(cities);
        System.out.println("Average of temporaries of cities: " + avgTemporary);

        City avgCity = getAvgCity(cities, avgTemporary, maxTemporary - minTemporary);
        System.out.println("Average of cities: " + avgCity);
    }

    public static City getAvgCity(List<City> cities, int avgTemporary, int diff) {
        City avgCity = new City();
        int minDifference = diff;
        for (City city : cities) {
            int diffOfTemp = Math.abs(city.getTemperature() - avgTemporary);
            if (diffOfTemp < minDifference) {
                minDifference = diffOfTemp;
                avgCity = city;
            }
        }
        return avgCity;
    }

    public static int getMinTempOfCities(List<City> cities) {
        int min = cities.get(0).getTemperature();
        for (City city : cities) {
            if (city.getTemperature() < min) {
                min = city.getTemperature();
            }
        }
        return min;
    }

    public static int getMaxTempOfCities(List<City> cities) {
        int max = cities.get(0).getTemperature();
        for (City city : cities) {
            if (city.getTemperature() > max) {
                max = city.getTemperature();
            }
        }
        return max;
    }

    public static int getAvgTempOfCities(List<City> cities) {
        int sumOfTemporaries = 0;
        for (City city : cities) {
            sumOfTemporaries += city.getTemperature();
        }
        return sumOfTemporaries / cities.size();
    }
}
