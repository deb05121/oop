package occupations;

public class Chef extends Person {

    public Chef() {
    }

    public Chef(int age, String name, Gender gender) {
        super(age, name, gender);
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s. I am %d. I am a %s and a chef.%n", this.getName(), this.getAge(), this.getGender());
    }

    @Override
    public void printGoal() {
        super.printGoal();
    }


    public void cook(String food) {
        System.out.printf("%s has cooked some %s.%n", this.getName(), food);
    }
}
