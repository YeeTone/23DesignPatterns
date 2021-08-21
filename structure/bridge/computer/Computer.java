package structure.bridge.computer;

import structure.bridge.brand.Brand;

public abstract class Computer {
    private Brand brand;
    public Computer(Brand brand){
        this.brand = brand;
    }

    public void info(){
        brand.info();
    }
}
