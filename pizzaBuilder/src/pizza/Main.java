package pizza;

public class Main {
    public static void main(String[] args) {
        Pizza pizzaFull = new Pizza.Builder(24)
                .cheese(true)
                .pepperoni(true)
                .bacon(true)
                .build();

        System.out.printf("Full pizza: %s\n",pizzaFull);

        Pizza pizzaA = new Pizza.Builder(18)
                .cheese(true)
                .build();
        System.out.printf("Pizza basic: %s\n", pizzaA);
    }
}
