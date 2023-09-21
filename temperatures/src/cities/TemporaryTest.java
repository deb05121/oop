package cities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TemporaryTest {
    @Test
    void tempOfCitiesTest() {
        List<City> cities = new ArrayList<>();
        City a = new City("A", 1);
        cities.add(a);
        City b = new City("B", 2);
        cities.add(b);
        City c = new City("C", 3);
        cities.add(c);
        City d = new City("D", 4);
        cities.add(d);
        City e = new City("E", 5);
        cities.add(e);
        Assertions.assertEquals(1, Main.getMinTempOfCities(cities));
        Assertions.assertEquals(5, Main.getMaxTempOfCities(cities));
        Assertions.assertEquals(3, Main.getAvgTempOfCities(cities));
        Assertions.assertEquals(c, Main.getAvgCity (cities, Main.getAvgTempOfCities(cities),Main.getMaxTempOfCities(cities)-Main.getMinTempOfCities(cities)));
    }

}
