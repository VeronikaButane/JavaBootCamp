package sef.module7.activity;

public class DrivingActivity {

    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        Driver driver = new Driver("Veronika");

        driver.setDriverMoving(car);
        driver.driverStartsDriving();

        driver.setDriverMoving(motorcycle);
        driver.driverStartsDriving();
    }

}