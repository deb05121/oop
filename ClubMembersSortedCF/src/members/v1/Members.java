package members.v1;

import java.util.SortedSet;
import java.util.TreeSet;

public class Members {
    private final SortedSet<Person> members;

    public Members() {
        members = new TreeSet<>();
    }

    public boolean add(Person person) {
        return members.add(person);
    }

    public boolean remove(Person person) {
        return members.remove(person);
    }

    public boolean contains(Person person) {
        return members.contains(person);
    }

    public int size() {
        return members.size();
    }

    public boolean isEmpty() {
        return members.isEmpty();
    }

    public void clear() {
        members.clear();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Person p : members) {
            str.append(p.toString()).append("; ");
        }
        return str.toString();
    }

}
