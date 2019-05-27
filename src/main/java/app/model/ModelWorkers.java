package app.model;

import app.entities.Worker;

import java.util.HashMap;

public class ModelWorkers {

    private static ModelWorkers instance = new ModelWorkers();

    private HashMap<String,Integer> map = null;

    public static ModelWorkers getInstance() {
        return instance;
    }

    private ModelWorkers() {
        map = new HashMap<>();
    }

    public void add (Worker worker) {
        map.put(worker.getName(),worker.getSells());
    }
}
