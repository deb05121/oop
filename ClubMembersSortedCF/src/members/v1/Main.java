package members.v1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws InvalidZipCodeException {
        Members members = new Members();

        Person personA0 = new PersonBuilder()
                .surname("Halas")
                .firstName("Attila")
                .dateOfBirth(LocalDate.ofEpochDay(19700505))
                .residence(1204, "Budapest", "Soroksári út 123.")
                .dateOfEnter(LocalDate.ofEpochDay(20210101))
                .grade(Grade.INTERMEDIATE)
                .build();
        Person personA1 = new PersonBuilder()
                .surname("Garas")
                .firstName("Attila")
                .dateOfBirth(LocalDate.ofEpochDay(19800505))
                .residence(1201, "Bp", "Soroksári út 111.")
                .dateOfEnter(LocalDate.ofEpochDay(20210101))
                .grade(Grade.INTERMEDIATE)
                .build();
        Person personA2 = new PersonBuilder()
                .surname("Fellow")
                .firstName("Attila")
                .dateOfBirth(LocalDate.ofEpochDay(19900505))
                .residence(1202, "Bpest", "Soroksári út 113.")
                .dateOfEnter(LocalDate.ofEpochDay(20210101))
                .grade(Grade.INTERMEDIATE)
                .build();
        Person personA3 = new PersonBuilder()
                .surname("Debreceni")
                .firstName("Attila")
                .dateOfBirth(LocalDate.ofEpochDay(19500505))
                .residence(1203, "Budapest", "Soroksári út 104.")
                .dateOfEnter(LocalDate.ofEpochDay(20210101))
                .grade(Grade.INTERMEDIATE)
                .build();
        Person personA4 = new PersonBuilder()
                .surname("Csala")
                .firstName("Attila")
                .dateOfBirth(LocalDate.ofEpochDay(19400505))
                .residence(1204, "Budapest", "Soroksári út 106.")
                .dateOfEnter(LocalDate.ofEpochDay(20210101))
                .grade(Grade.INTERMEDIATE)
                .build();
        Person personA5 = new PersonBuilder()
                .surname("Bart")
                .firstName("Attila")
                .dateOfBirth(LocalDate.ofEpochDay(19660505))
                .residence(1205, "Budapest", "Soroksári út 114.")
                .dateOfEnter(LocalDate.ofEpochDay(20210101))
                .grade(Grade.INTERMEDIATE)
                .build();
        Person personA6 = new PersonBuilder()
                .surname("Aba")
                .firstName("Attila")
                .dateOfBirth(LocalDate.ofEpochDay(19750505))
                .residence(1206, "Budapest", "Soroksári út 126.")
                .dateOfEnter(LocalDate.ofEpochDay(20210101))
                .grade(Grade.INTERMEDIATE)
                .build();
        Person personB = new PersonBuilder()
                .surname("Aba")
                .firstName("Attila")
                .dateOfBirth(LocalDate.ofEpochDay(19610505))
                .residence(1204, "Budapest", "Soroksári út 234.")
                .dateOfEnter(LocalDate.ofEpochDay(20210101))
                .grade(Grade.NOVICE)
                .build();
        Person personC = new PersonBuilder()
                .surname("Aba")
                .firstName("Anna")
                .dateOfBirth(LocalDate.ofEpochDay(19620505))
                .residence(1204, "Budapest", "Soroksári út 321.")
                .dateOfEnter(LocalDate.ofEpochDay(20210101))
                .grade(Grade.PROFICIENT)
                .build();
        Person personD = new PersonBuilder()
                .surname("Aba")
                .firstName("Anett")
                .dateOfBirth(LocalDate.ofEpochDay(1960505))
                .residence(1204, "Budapest", "Soroksári út 210.")
                .dateOfEnter(LocalDate.ofEpochDay(20210101))
                .grade(Grade.MASTER)
                .build();

        System.out.println("PersonA0 added: " + members.add(personA0));
        System.out.println("PersonA1 added: " + members.add(personA1));
        System.out.println("PersonA2 added: " + members.add(personA2));
        System.out.println("PersonA3 added: " + members.add(personA3));
        System.out.println("PersonA4 added: " + members.add(personA4));
        System.out.println("PersonA5 added: " + members.add(personA5));
        System.out.println("PersonA6 added: " + members.add(personA6));

        System.out.println("PersonA7 added: " + members.add(personB));
        System.out.println("PersonA8 added: " + members.add(personC));
        System.out.println("PersonA9 added: " + members.add(personD));

        System.out.println(members);
        System.out.println(members.size());
        System.out.println(members.contains(personA0));
        System.out.println(members.isEmpty());
        System.out.println(members.remove(personA0));
        System.out.println(members);
        System.out.println(members.size());
        members.clear();
        System.out.println(members.size());

    }
}
