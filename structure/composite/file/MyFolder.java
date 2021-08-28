package structure.composite.file;

import java.util.ArrayList;
import java.util.List;

public class MyFolder extends MyFile{
    private final List<MyFile> subFiles = new ArrayList<>();

    public MyFolder(String name) {
        super(name);
    }

    public void addMyFile(MyFile myFile){
        this.subFiles.add(myFile);
    }

    public void removeMyFile(MyFile myFile){
        this.subFiles.remove(myFile);
    }

    public List<MyFile> getSubFiles() {
        return subFiles;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("MyFolder::").append(this.getName()).append(System.lineSeparator());

        for (MyFile mf:subFiles){
            b.append(mf.toString()).append(System.lineSeparator());
        }

        return b.toString();
    }
}
