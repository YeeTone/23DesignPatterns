package behavior.visitor.part;

import behavior.visitor.visitor.ComputerVisitor;

import java.util.ArrayList;
import java.util.List;

public class Computer implements ComputerPart{
    private final List<ComputerPart> parts = new ArrayList<>();

    public Computer(){
        this.parts.add(new Keyboard());
        this.parts.add(new Monitor());
        this.parts.add(new Mouse());
    }

    @Override
    public void accept(ComputerVisitor visitor) {
        for (ComputerPart p: parts){
            p.accept(visitor);
        }
        visitor.visit(this);
    }
}
