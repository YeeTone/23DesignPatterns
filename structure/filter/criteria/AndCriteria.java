package structure.filter.criteria;

import structure.filter.person.Person;

import java.util.List;

public class AndCriteria implements Criteria {
    private final Criteria criteria1;
    private final Criteria criteria2;

    public AndCriteria(Criteria criteria1, Criteria criteria2) {
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> ps = criteria1.meetCriteria(people);
        return criteria2.meetCriteria(ps);
    }
}
