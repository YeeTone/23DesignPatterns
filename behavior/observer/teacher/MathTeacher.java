package behavior.observer.teacher;

public class MathTeacher extends Teacher{
    @Override
    public void inClassroom() {
        notifyAllStudentsQuite("数学老师带着一大本作业走进了教室！");
    }

    @Override
    public void outClassroom() {
        notifyAllStudentsNoisy("数学老师离开了教室！");
    }

}
