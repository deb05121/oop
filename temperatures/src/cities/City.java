package cities;

public class City {
    private String nameOfCity;
    private int temperature;


    public City() {

    }

    public City(String name, int temp) {
        this.nameOfCity = name;
        this.temperature = temp;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return String.format("%n") + "City{" +
                "nameOfCity='" + nameOfCity + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}
