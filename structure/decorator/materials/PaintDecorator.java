package structure.decorator.materials;

public class PaintDecorator extends AbstractDecorator{

    public PaintDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        System.out.print("油画-");
        super.decorated.display();
    }
}
