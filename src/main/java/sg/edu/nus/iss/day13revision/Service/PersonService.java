package sg.edu.nus.iss.day13revision.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import sg.edu.nus.iss.day13revision.Model.Person;

@Service
public class PersonService {
    private List<Person> persons = new ArrayList<>();

    public PersonService() {
        persons.add(new Person("Mark", "Zuckerberg"));
        persons.add(new Person("Elon", "Musk"));

    }

    public List<Person> getPersons() {
        return this.persons;
    }

    public void addPerson (Person p) {
        persons.add( new Person (p.getFirstName(), p.getLastName()) );
    }
}
