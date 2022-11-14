import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

public class PersonServiceTest {

    int personsSize = 3;

    @Test
    public void listAllPersonsNamesValid() {
        //given
        PersonService personService = new PersonService();

        //when
        List<String> result = personService.listAllPersonsNames();

        //then
        Assertions.assertEquals(result.size(), personsSize);
        Assertions.assertEquals(result.get(0), "Ioana Chirila");
    }

    @Test
    public void listMajorPersonsValid() {
        //given
        PersonService personService = new PersonService();

        // when
        List<Person> result = personService.listMajorPersons();

        //then
        Assertions.assertEquals(result.get(0), new Person("Andrei", "Pop", 34, "Oradea"));
    }

    @Test
    public void listPersonsfromOradeaValid() {
        //given
        PersonService personService = new PersonService();

        // when
        List<Person> result = personService.listPersonsfromOradea();

        //then
        Assertions.assertEquals(result.get(0), new Person("Andrei", "Pop", 34, "Oradea"));
    }

    @Test
    public void listPersonsfromOradeaOrClujValid() {
        //given
        PersonService personService = new PersonService();

        // when
        List<Person> result = personService.listPersonsfromOradeaOrCluj();

        //then
        Assertions.assertEquals(result.size(), 2);
        Assertions.assertEquals((result), List.of(
                new Person("Ioana", "Chirila", 17, "Cluj"),
                new Person("Andrei", "Pop", 34, "Oradea")
        ));
    }

    @Test
    public void listFirstNamesCapitalizedValid() {
        //given
        PersonService personService = new PersonService();

        //when
        List<String> result = personService.listFirstNamesCapitalized();

        //then
        Assertions.assertEquals(result.size(), personsSize);
        Assertions.assertEquals(result.get(0), "IOANA");
    }

    @Test
    public void listAllPersonsNamesModifiedValid() {
        //given
        PersonService personService = new PersonService();

        //when
        List<String> result = personService.listAllPersonsNamesModified();

        //then
        Assertions.assertEquals(result.size(), personsSize);
        Assertions.assertEquals(result.get(0), "Ioana C.");
    }

    @Test
    public void listPersonsAgeInterval18_60Valid() {
        //given
        PersonService personService = new PersonService();

        // when
        List<Person> result = personService.listPersonsAgeInterval18_60();

        //then
        Assertions.assertEquals(result.get(0), new Person("Andrei", "Pop", 34, "Oradea"));
    }

    @Test
    public void listPersonsNameStartingWithAValid() {
        //given
        PersonService personService = new PersonService();

        // when
        List<Person> result = personService.listPersonsNameStartingWithA();

        //then
        Assertions.assertEquals(result.get(0), new Person("Andrei", "Pop", 34, "Oradea"));
    }

    @Test
    public void listAllPersonsNamesUniquelyValid() {
        //given
        PersonService personService = new PersonService();

        //when
        Set<String> result = personService.listAllPersonsNamesUniquely();

        //then
        Assertions.assertEquals(result.size(), 2);
        Assertions.assertEquals(result, Set.of(
                "Ioana", "Andrei"));
    }

    @Test
    public void sortPersonsFirstNameValid() {
        //given
        PersonService personService = new PersonService();

        //when
        List<Person> result = personService.sortPersonsFirstName();

        //then
        Assertions.assertEquals(result.size(), personsSize);
        Assertions.assertEquals(result.get(0), new Person("Andrei", "Pop", 34, "Oradea"));
    }

    @Test
    public void sortPersonsLastNameValid() {
        //given
        PersonService personService = new PersonService();

        //when
        List<Person> result = personService.sortPersonsLastName();

        //then
        Assertions.assertEquals(result.size(), personsSize);
        Assertions.assertEquals(result.get(0), new Person("Ioana", "Chirila", 17, "Cluj"));
    }

    @Test
    public void sortPersonsMultipleValid() {
        //given
        PersonService personService = new PersonService();

        //when
        List<Person> result = personService.sortPersonsMultiple();

        //then
        Assertions.assertEquals(result.size(), personsSize);
        Assertions.assertEquals(result.get(0), new Person("Andrei", "Pop", 34, "Oradea"));
    }

}
