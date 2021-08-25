package structure.filter.person;

public class Person {
    private final int age;
    private final String name;
    private final String gender;
    private final String maritalStatus;

    public Person(int age, String name, String gender, String maritalStatus) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public int getAge() {
        return age;
    }
}
