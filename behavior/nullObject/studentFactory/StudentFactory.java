package behavior.nullObject.studentFactory;

import behavior.nullObject.student.*;

import java.util.ArrayList;
import java.util.List;

public class StudentFactory {
    private final List<String> availableNames = new ArrayList<>();

    public void addStudentName(String name){
        this.availableNames.add(name);
    }

    public AbstractStudent getStudent(String name,int level){
        if(availableNames.contains(name)){
            switch (level) {
                case 1 -> {
                    return new PupilStudent(name);
                }
                case 2 -> {
                    return new MiddleStudent(name);
                }
                case 3 -> {
                    return new CollegeStudent(name);
                }
                default -> {
                    return new NullStudent();
                }
            }
        }else {
            return new NullStudent();
        }
    }
}
