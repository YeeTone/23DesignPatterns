package structure.decorator.materials;

public class GlassDecorator extends AbstractDecorator{

    public GlassDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        System.out.print("玻璃包装-");
        super.decorated.display();
    }
}
