package behavior.visitor.visitor;

import behavior.visitor.part.Computer;
import behavior.visitor.part.Keyboard;
import behavior.visitor.part.Monitor;
import behavior.visitor.part.Mouse;

public class SonyComputerVisitor implements ComputerVisitor{
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("索尼公司检查键盘！主要侧重于键盘的外形！");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("索尼公司检查显示器！主要侧重于显示器的功能性！");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("索尼公司检查鼠标！主要侧重于鼠标的连接鲁棒性！");
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("索尼公司检查电脑！主要侧重于电脑的运行速度！");
    }
}
