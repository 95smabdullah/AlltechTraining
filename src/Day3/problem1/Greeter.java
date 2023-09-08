package Day3.problem1;

public class Greeter {
    String name;

    public Greeter(String aName) {
        this.name = aName;
    }
    public String sayHello(){
        return "Hi and welcome "+this.name;
    }
    public void sayGoodBye(){
        System.out.println("Bye "+ this.name);
    }

}
