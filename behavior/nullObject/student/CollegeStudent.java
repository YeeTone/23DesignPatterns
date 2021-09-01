package behavior.nullObject.student;

public class CollegeStudent extends AbstractStudent {

    public CollegeStudent(String name) {
        super(name);
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
