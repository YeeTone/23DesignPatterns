package behavior.nullObject.student;

public class MiddleStudent extends AbstractStudent {

    public MiddleStudent(String name) {
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
