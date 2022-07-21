package sg.edu.nus.iss.day13revisionproject.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import sg.edu.nus.iss.day13revisionproject.models.Person;

@Service
public class PersonService {
    private List<Person> persons = new ArrayList<>();

    public PersonService() {
        persons.add(new Person("Mark", "Zuckerberg"));
        persons.add(new Person("Elon", "Musk"));
    }

    //method to return the list of person
    public List<Person> getPersons() {
        return this.persons;
    }

    //method to add persons to the persons list
    public void addPerson(Person p) {
        persons.add(new Person(p.getFirstName(), p.getLastName()));
    }

    
}
