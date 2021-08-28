package structure.composite.file;

public class MyTextFile extends MyFile{

    public MyTextFile(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "MyTextFile::"+super.getName();
    }
}
