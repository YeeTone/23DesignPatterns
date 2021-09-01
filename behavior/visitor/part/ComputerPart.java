package behavior.visitor.part;

import behavior.visitor.visitor.ComputerVisitor;

public interface ComputerPart {
    void accept(ComputerVisitor computerVisitor);
}
