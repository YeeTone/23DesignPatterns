package behavior.nullObject.student;

public class NullStudent extends AbstractStudent {
    public NullStudent(){
        super(null);
    }

    public NullStudent(String name) {
        super(name);
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String toString() {
        return "No such available student!";
    }
}
