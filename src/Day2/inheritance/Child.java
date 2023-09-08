package Day2.inheritance;

public class Child extends Father{
    int childAge;
    public Child(int childAge){
        super(childAge+30);
        this.childAge = childAge;
    }
    public void showChildAge(){
        showFatherAge();
        System.out.println("Child's age is - "+ this.childAge);
    }
}
