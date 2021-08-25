package structure.filter.criteria;

import structure.filter.person.Person;

import java.util.*;

public class OrCriteria implements Criteria{
    private final Criteria criteria1;
    private final Criteria criteria2;

    public OrCriteria(Criteria criteria1, Criteria criteria2) {
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> ps1 = criteria1.meetCriteria(people);
        List<Person> ps2 = criteria2.meetCriteria(people);

        Set<Person> psSet = new HashSet<>();
        psSet.addAll(ps1);
        psSet.addAll(ps2);

        return new ArrayList<>(psSet);
    }
}
