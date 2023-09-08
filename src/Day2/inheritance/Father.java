package Day2.inheritance;

public class Father extends GrandFather{
    int fatherAge;

    public Father(int fatherAge) {
        super(fatherAge+30);
        this.fatherAge = fatherAge;
    }
    public void showFatherAge(){
        showGrandfatherAge();
        System.out.println("Father's age is - "+ this.fatherAge);
    }
}
