package structure.decorator.materials;

public abstract class AbstractDecorator implements Component{
    protected final Component decorated;

    public AbstractDecorator(Component component){
        this.decorated = component;
    }

    @Override
    public abstract void display();
}
