package Day2;

interface A{
    default void foo(){
        System.out.println("A's foo");
    }
}
interface B extends A{
    default void foo(){
        System.out.println("B's foo");
    }
}

interface C extends A{
    default void foo(){
        System.out.println("C's foo");
    }
}

class D implements B, C {
    public void foo(){
        B.super.foo();
        C.super.foo();
        System.out.println("D's foo");

    }

}
public class DiamondProbSol {
    public static void main(String[] args){
        D d = new D();
        d.foo();

    }
}
