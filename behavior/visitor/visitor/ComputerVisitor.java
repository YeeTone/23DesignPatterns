package behavior.visitor.visitor;

import behavior.visitor.part.Computer;
import behavior.visitor.part.Keyboard;
import behavior.visitor.part.Monitor;
import behavior.visitor.part.Mouse;

public interface ComputerVisitor {
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
    void visit(Mouse mouse);

    void visit(Computer computer);

}
