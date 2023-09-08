package Day2.problem5;

public class SportsCar extends Car {
    String airBallonType;

    public SportsCar(String airBallonType) {
        super();
        this.airBallonType = airBallonType;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(airBallonType);
    }
}
