package structure.composite.file;

public abstract class MyFile {
    String name;

    public MyFile(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public abstract String toString();
}
