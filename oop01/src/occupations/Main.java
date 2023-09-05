package occupations;

public class Main {
    public static void main(String[] args) {
        Person personA = new Person(55, "Jani", Gender.MAN);
        Chef personX = new Chef(42, "Gábor", Gender.MAN);

        personA.introduce();
        personA.printGoal();
        personX.introduce();
        personX.cook("broccoli");
    }
}
