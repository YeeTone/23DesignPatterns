package structure.filter.criteria;

import structure.filter.person.Person;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> people);
}
