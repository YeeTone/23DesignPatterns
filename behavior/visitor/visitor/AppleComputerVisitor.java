package behavior.visitor.visitor;

import behavior.visitor.part.Computer;
import behavior.visitor.part.Keyboard;
import behavior.visitor.part.Monitor;
import behavior.visitor.part.Mouse;

public class AppleComputerVisitor implements ComputerVisitor{
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("苹果公司检查键盘！主要侧重于键盘的功能性！");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("苹果公司检查显示器！主要侧重于显示器的流畅运行！");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("苹果公司检查鼠标！主要侧重于鼠标的手感！");
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("苹果公司检查电脑！主要侧重于电脑的外形！");
    }
}
