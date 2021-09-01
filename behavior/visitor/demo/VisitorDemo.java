package behavior.visitor.demo;

import behavior.visitor.part.Computer;
import behavior.visitor.part.ComputerPart;
import behavior.visitor.visitor.AppleComputerVisitor;
import behavior.visitor.visitor.SonyComputerVisitor;

public class VisitorDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new AppleComputerVisitor());
        computer.accept(new SonyComputerVisitor());

    }
}
