package Day7.LambdaExpressionExample;

@FunctionalInterface
interface MyInterface {
    public abstract void function(int a, int b);
}
public class SumOf {
    public static void main(String[] args) {
        MyInterface mf = (a,b)->System.out.println(a+b);
        mf.function(3,4);
    }
}
