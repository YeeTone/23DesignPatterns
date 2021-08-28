package structure.bridge.demo;

import structure.bridge.brand.Apple;
import structure.bridge.brand.Lenovo;
import structure.bridge.computer.Computer;
import structure.bridge.computer.Desktop;
import structure.bridge.computer.Laptop;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Computer appleDesktop = new Desktop(new Apple());
        appleDesktop.info();
        Computer lenovoLaptop = new Laptop(new Lenovo());
        lenovoLaptop.info();
    }
}
