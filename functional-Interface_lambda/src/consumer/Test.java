package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        whenNamesPresentConsumeAll();
        whenNamesPresentUseBothConsumer();
    }

    public static void whenNamesPresentConsumeAll() {
        Consumer<String> printConsumer = System.out::println;
        Stream<String> cities = Stream.of("Sydney", "Dhaka", "New York", "London");
        cities.forEach(printConsumer);
    }

    public static void whenNamesPresentUseBothConsumer() {
        List<String> cities = Arrays.asList("Sydney", "Dhaka", "New York", "London");

        Consumer<List<String>> upperCaseConsumer = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i).toUpperCase());
            }
        };
        Consumer<List<String>> printConsumer = list -> list.forEach(System.out::println);

        upperCaseConsumer.andThen(printConsumer).accept(cities);    //Consumer interface has accept() method
    }

}

