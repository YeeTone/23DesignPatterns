package structure.decorator.materials;

public class GoldEdgeDecorator extends AbstractDecorator{
    public GoldEdgeDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        System.out.print("金边镶嵌-");
        super.decorated.display();
    }
}
