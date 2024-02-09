package composed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        List<Person> roster = new ArrayList<>();
        Person p1 = new Person("Pete",24, Person.Sex.MALE,"pete@office.com");
        roster.add(p1);
        Person p2 = new Person("Juli",22, Person.Sex.FEMALE,"juli@office.com");
        roster.add(p2);
        Person p3 = new Person("Rob",26, Person.Sex.MALE,"rob@office.com");
        roster.add(p3);
    //functional interface calling
        processElements(
                roster,
                p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25,
                p -> p.getEmailAddress(),
                email -> System.out.println(email)
        );
    }
   //functional interface
    public static <X, Y> void processElements(Iterable<X> source, Predicate<X> tester, Function<X, Y> mapper, Consumer<Y> block) {
        for (X p : source) {
            if (tester.test(p)) {
                Y data = mapper.apply(p);
                block.accept(data);
            }
        }
    }
}
