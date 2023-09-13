package Day7.DefaultMethodExample;

public class Car implements Vehicle{
    @Override
    public void startVehicle(){
        System.out.println("starting Car");
    }

    public void parentStart(){
        Vehicle.super.startVehicle();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.startVehicle();
        car.parentStart();
        Vehicle.cleanVehicle();
    }
}
