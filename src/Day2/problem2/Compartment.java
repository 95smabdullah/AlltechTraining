package Day2.problem2;

public abstract class Compartment {
    abstract public void notice();
}

class FirstClass extends Compartment{

    @Override
    public void notice() {
        System.out.println("First Class Passengers Only");
    }
}

class Ladies extends Compartment{

    @Override
    public void notice() {
        System.out.println("Lady Passengers Only");
    }
}

class General extends Compartment{

    @Override
    public void notice() {
        System.out.println("General Passengers Only");
    }
}

class Luggage extends Compartment{

    @Override
    public void notice() {
        System.out.println("Cargo Coach");
    }
}