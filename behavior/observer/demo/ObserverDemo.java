package behavior.observer.demo;

import behavior.observer.student.BadStudent;
import behavior.observer.student.GoodStudent;
import behavior.observer.student.Student;
import behavior.observer.teacher.ChineseTeacher;
import behavior.observer.teacher.MathTeacher;
import behavior.observer.teacher.Teacher;

public class ObserverDemo {
    public static void main(String[] args) {
        Student good = new GoodStudent("YeeTone");
        Student bad = new BadStudent("Null");

        Teacher chinese = new ChineseTeacher();
        chinese.addStudent(good);
        chinese.addStudent(bad);

        Teacher math = new MathTeacher();
        math.addStudent(good);

        chinese.inClassroom();
        chinese.outClassroom();

        math.inClassroom();
        math.outClassroom();
    }
}
