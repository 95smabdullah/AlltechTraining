package Day3.problem3;

public class Number {
    int firstNumber;
    int secondNumber;
    double result;

    public Number(int x, int y){
        this.firstNumber = x;
        this.secondNumber= y;
    }

    public void add(){
        this.result = firstNumber+secondNumber;
    }

    public  void sub(){
        this.result = firstNumber-secondNumber;
    }

    public  void mul(){
        this.result = firstNumber*secondNumber;
    }

    public void div(){
        try {
            if(secondNumber==0){
                throw new IllegalArgumentException("Cannot divide by 0");
            }
            else this.result = (double) firstNumber / secondNumber;
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

    }
}
