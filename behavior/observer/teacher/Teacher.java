package behavior.observer.teacher;

import behavior.observer.student.Student;

import java.util.ArrayList;
import java.util.List;

public abstract class Teacher {
    protected List<Student> observerStudents = new ArrayList<>();

    public void addStudent(Student student){
        this.observerStudents.add(student);
    }

    public void removeStudent(Student student){
        this.observerStudents.remove(student);
    }
    public abstract void inClassroom();

    public abstract void outClassroom();

    public void notifyAllStudentsQuite(String message) {
        for (Student student:this.observerStudents){
            student.quite(message);
        }
    }

    public void notifyAllStudentsNoisy(String message) {
        for (Student student:this.observerStudents){
            student.noisy(message);
        }
    }
}
