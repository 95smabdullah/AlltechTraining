package Day2;

public class MethodOverriding {
    public void thisMethod(){
        System.out.println("This is original method");

    }
}

class OverriderClass extends MethodOverriding{
    @Override
    public void thisMethod(){
        System.out.println("This is the overridden method");
    }
}
class test{
    public static void main(String[] args){
    MethodOverriding mo = new OverriderClass();
    mo.thisMethod();
}
}