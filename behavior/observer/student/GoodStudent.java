package behavior.observer.student;

public class GoodStudent implements Student{
    private final String name;

    public GoodStudent(String name) {
        this.name = name;
    }

    @Override
    public void quite(String message) {
        System.out.println(message+name+"需要保持安静好好学习，给老师留下好印象！");
    }

    @Override
    public void noisy(String message) {
        System.out.println(message+name+ "在老师不在的时候也要自觉，要把规定的功课都完成！");
    }
}
