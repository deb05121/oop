package sortOfStrings;

import java.util.ArrayList;
import java.util.List;

public class SolutionWithLambda {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("John", "Adam", "Victoria", "Aaron", "Robert", "Ursula", "Lauren", "Elisabeth", "Zeno"));
        names.sort((first, second) -> Integer.compare(first.length(), second.length()));
        System.out.println(names);
    }
}
