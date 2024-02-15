package sortOfStrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SolutionWithAnonymousClass {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("John", "Adam", "Victoria", "Aaron", "Robert", "Ursula", "Lauren", "Elisabeth", "Zeno"));
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String first, String second) {
                return Integer.compare(first.length(), second.length());
            }
        });
        System.out.println(names);
    }
}
