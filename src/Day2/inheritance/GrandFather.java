package Day2.inheritance;

public class GrandFather {
    int grandFatherAge;

    public GrandFather(int grandFatherAge) {
        this.grandFatherAge = grandFatherAge;
    }
    public void showGrandfatherAge(){
        System.out.println("Grandfather's age is - " + this.grandFatherAge);
    }
}
