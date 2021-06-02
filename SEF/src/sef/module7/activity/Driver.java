package sef.module7.activity;

public class Driver {

    private String name;
    private Moving driversMoving;

    public Driver(String name) {
        this.name = name;
    }

    public void setDriverMoving(Moving driversMoving) {
        this.driversMoving = driversMoving;
    }

    public void driverStartsDriving() {
        System.out.print("Driver " + name + " ");
        driversMoving.drive();
    }

}