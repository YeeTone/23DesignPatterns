package structure.facade.facade;

import structure.facade.worker.ColorWorker;
import structure.facade.worker.ShapeWorker;
import structure.facade.worker.WheelWorker;
import structure.facade.worker.Worker;

public class Facade {
    private final Worker wheelWorker = new WheelWorker();
    private final Worker colorWorker = new ColorWorker();
    private final Worker shapeWorker = new ShapeWorker();

    public void work(){
        shapeWorker.work();
        wheelWorker.work();
        colorWorker.work();
    }
}
