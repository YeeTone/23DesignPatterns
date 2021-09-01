package behavior.nullObject.student;

public abstract class AbstractStudent {
    protected final String name;

    public AbstractStudent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract boolean isNull();

    @Override
    public String toString() {
        return this.getClass().getName()+"{" +
                "name='" + name + '\'' +
                '}';
    }
}
