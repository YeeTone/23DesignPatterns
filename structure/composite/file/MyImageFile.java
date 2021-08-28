package structure.composite.file;

public class MyImageFile extends MyFile{
    public MyImageFile(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "MyImageFile::"+super.getName();
    }
}
