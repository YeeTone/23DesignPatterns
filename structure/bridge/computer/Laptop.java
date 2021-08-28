package structure.bridge.computer;

import structure.bridge.brand.Brand;

public class Laptop extends Computer{
    public Laptop(Brand brand){
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println(" Laptop");
    }
}
