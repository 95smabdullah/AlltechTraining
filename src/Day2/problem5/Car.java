package Day2.problem5;

public class Car {
    int speed;
    int noOfGear;
    public Car() {
        this.noOfGear = 0;
        this.speed = 0;
    }

    public void drive(int speed, int noOfGear){
        this.speed += speed;
        this.noOfGear += noOfGear;

    }

    public void display(){
        System.out.println("Speed: "+speed+" No of Gears: "+noOfGear);
    }
}
