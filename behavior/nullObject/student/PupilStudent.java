package behavior.nullObject.student;

public class PupilStudent extends AbstractStudent {
    public PupilStudent(String name) {
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
