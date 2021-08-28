package structure.composite.demo;

import structure.composite.file.MyFile;
import structure.composite.file.MyFolder;
import structure.composite.file.MyTextFile;
import structure.composite.file.MyVideoFile;

public class CompositeDemo {
    public static void main(String[] args) {
        MyFolder wholeFolder = new MyFolder("WholeFolder");
        MyFolder subFolder1 = new MyFolder("SubFolder1");
        MyFolder subFolder2 = new MyFolder("SubFolder2");
        wholeFolder.addMyFile(subFolder1);
        wholeFolder.addMyFile(subFolder2);

        MyFile textFile1 = new MyTextFile("TextFile1");
        subFolder1.addMyFile(textFile1);

        MyFile videoFile1 = new MyVideoFile("VideoFile1");
        MyFile textFile2 = new MyTextFile("TextFile2");
        subFolder2.addMyFile(videoFile1);
        subFolder2.addMyFile(textFile2);

        System.out.println(wholeFolder);
    }
}
