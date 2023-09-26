package company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        CsvParser parser = new CsvParser("C:/OOP/oop/parsingCSV/download/people-and-occupations.csv", CsvSeparator.SEMICOLON);
        List<List<String>> peopleStringList = parser.parse();

        List<Person> people = new ArrayList<>();
        List<String> maliciousData = new ArrayList<>();

        Validator<String> nameValidator = new NameValidator();
        Validator<Integer> ageValidator = new AgeValidator();
        Validator<String> occupationValidator = new OccupationValidator();

        for (List<String> person : peopleStringList) {
            String personName = person.get(0);
            int personAge = Integer.parseInt(person.get(1));
            String personOccupation = person.get(2);
            if (nameValidator.isValid(personName) && ageValidator.isValid(personAge) && occupationValidator.isValid(personOccupation)) {
                people.add(new Person(personName, personAge, personOccupation));
            } else {
                maliciousData.add(person.toString());
            }
        }
        System.out.println(people);
        System.out.println(maliciousData);
    }
}
