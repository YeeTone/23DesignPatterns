package behavior.nullObject.demo;

import behavior.nullObject.studentFactory.StudentFactory;

public class NullObjectDemo {
    public static void main(String[] args) {
        StudentFactory factory = new StudentFactory();

        factory.addStudentName("YeeTone");
        factory.addStudentName("Zhixin");

        System.out.println(factory.getStudent("YeeTone",3));
        System.out.println(factory.getStudent("Zhixin",1));

        System.out.println(factory.getStudent("XXX",2));
        System.out.println(factory.getStudent("YeeTone",4));
    }
}
