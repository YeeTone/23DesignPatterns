package behavior.observer.teacher;

import behavior.observer.student.Student;

public class ChineseTeacher extends Teacher{
    @Override
    public void inClassroom() {
        notifyAllStudentsQuite("语文老师走进了教室！");
    }

    @Override
    public void outClassroom() {
        notifyAllStudentsNoisy("语文老师离开了教室！");
    }




}
