package structure.filter.criteria;

import structure.filter.person.Person;

import java.util.ArrayList;
import java.util.List;

public class MaleCriteria implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> result = new ArrayList<>();
        for (Person p: people){
            if(p.getGender().equalsIgnoreCase("MALE")){
                result.add(p);
            }
        }

        return result;
    }
}
