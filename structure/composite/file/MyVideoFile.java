package structure.composite.file;

public class MyVideoFile extends MyFile{
    public MyVideoFile(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "MyVideoFile::"+super.getName();
    }
}
