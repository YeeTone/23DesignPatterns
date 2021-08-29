package structure.proxy.dynamicProxy;

public class Student implements Examer{
    private final String name;

    public Student(String name){
        this.name = name;
    }


    @Override
    public void chineseExam() {
        System.out.println("学生"+this.name+"正在语文考场上奋笔疾书！");
    }

    @Override
    public void mathExam() {
        System.out.println("学生"+this.name+"正在数学考场上埋头苦算！");
    }

    @Override
    public void englishExam() {
        System.out.println("学生"+this.name+"正在英语考场上舞文弄墨！");
    }

    @Override
    public void scienceExam() {
        System.out.println("学生"+this.name+"正在科学考场上展现自我！");
    }
}
