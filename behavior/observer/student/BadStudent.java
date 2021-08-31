package behavior.observer.student;

public class BadStudent implements Student{
    private final String name;

    public BadStudent(String name) {
        this.name = name;
    }

    @Override
    public void quite(String message) {
        System.out.println(message+name+ "赶紧保持安静，小心被恶魔老师收拾！");
    }

    @Override
    public void noisy(String message) {
        System.out.println(message+name+"的老师终于走了，赶紧开始玩耍！");
    }
}
