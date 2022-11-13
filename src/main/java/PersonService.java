import java.util.*;

public class PersonService {
    private static List<Person> persons = List.of(
            new Person("Ioana", "Chirila", 17, "Cluj"),
            new Person("Andrei", "Pop", 34, "Oradea"),
            new Person("Ioana", "Chirila", 25, "Satu Mare")
            );

    public static List<String> listAllPersonsNames() {
        List<String> result = new ArrayList<>();
        if (persons != null) {
            persons.stream()
                    .forEach(person1 -> result.add(person1.firstName() + " " + person1.lastName()));
        }
        return result;
    }

    public static List<Person> listMajorPersons() {
        List<Person> result = new ArrayList<>();
        if (persons != null) {
            result = persons.stream()
                    .filter(person1 -> person1.age() >= 18)
                    .toList();
        }
        return result;
    }

    public static List<Person> listPersonsfromOradea() {
        List<Person> result = new ArrayList<>();
        if (persons != null) {
            result =
                    persons.stream()
                            .filter(person1 -> person1.city().equals("Oradea"))
                            .toList();
        }
        return result;
    }

    public static List<Person> listPersonsfromOradeaOrCluj() {
        List<Person> result = new ArrayList<>();
        if (persons != null) {
            result = persons.stream()
                    .filter(person1 -> person1.city().equals("Oradea") || person1.city().equals("Cluj"))
                    .toList();
        }
        return result;
    }

    public static List<String> listFirstNamesCapitalized() {
        List<String> result = new ArrayList<>();
        if (persons != null) {
            persons.stream()
                    .forEach(person1 -> result.add(person1.firstName().toUpperCase()));
        }
        return result;
    }

    public static List<String> listAllPersonsNamesModified() {
        List<String> result = new ArrayList<>();
        if (persons != null) {
            persons.stream()
                    .forEach(person1 -> result.add(person1.firstName() + " " + person1.lastName().charAt(0) + "."));
        }
        return result;
    }

    public static List<Person> listPersonsAgeInterval18_60() {
        List<Person> result = new ArrayList<>();
        if (persons != null) {
            result = persons.stream()
                    .filter(person1 -> person1.age() > 18 && person1.age() < 60)
                    .toList();
        }
        return result;
    }

    public static List<Person> listPersonsNameStartingWithA() {
        List<Person> result = new ArrayList<>();
        if (persons != null) {
            result = persons.stream()
                    .filter(person1 -> person1.firstName().charAt(0) == 'A')
                    .toList();
        }
        return result;
    }

    public static Set<String> listAllPersonsNamesUniquely() {
        Set<String> result = new HashSet<>();
        if (persons != null) {
            persons.stream()
                    .forEach(person1 -> result.add(person1.firstName()));
        }
        return result;
    }

    public static List<Person> sortPersonsFirstName() {
        List<Person> result = new ArrayList<>();
        if (persons != null) {
            result = persons.stream()
                    .sorted(Comparator.comparing(Person::firstName))
                    .toList();
        }
        return result;
    }

    public static List<Person> sortPersonsLastName() {
        List<Person> result = new ArrayList<>();
        if (persons != null) {
            result = persons.stream()
                    .sorted(Comparator.comparing(Person::lastName))
                    .toList();
        }
        return result;
    }

    public static List<Person> sortPersonsMultiple() {
        List<Person> result = new ArrayList<>();
        if (persons != null) {
            result = persons.stream()
                    .sorted(Comparator.comparing(Person::firstName)
                            .thenComparing(Person::lastName).thenComparing(Person::age))
                    .toList();
        }
        return result;
    }

}
