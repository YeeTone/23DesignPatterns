package behavior.visitor.part;

import behavior.visitor.visitor.ComputerVisitor;

public class Monitor implements ComputerPart{
    @Override
    public void accept(ComputerVisitor visitor) {
        visitor.visit(this);
    }
}
