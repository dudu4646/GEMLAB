package sample.classes;

public class Stone {
    private String clientRef,shape,service;
    private double per,total,weight;
    private boolean seconderyService, addService;

    public Stone(String clientRef, String shape, String service, double per, double total, double weight, boolean seconderyService, boolean addService) {
        this.clientRef = clientRef;
        this.shape = shape;
        this.service = service;
        this.per = per;
        this.total = total;
        this.weight = weight;
        this.seconderyService = seconderyService;
        this.addService = addService;
    }

    

    @Override
    public String toString() {
    return "Ref: "+clientRef+", Shape: "+shape+" , Weight: "+weight+" , "+service;
    }
}
