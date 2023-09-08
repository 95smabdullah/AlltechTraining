package Day2;

abstract class figure{
    double dim1;
    double dim2;

    public figure(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract void area();
}

class triangle extends figure{
    public triangle(double dim1, double dim2){
        super( dim1,  dim2);
    }


    @Override
    void area(){
        System.out.println("Area of triangle "+dim1*dim2*0.5);
    }
}

class rectangle extends figure{
    public rectangle(double dim1, double dim2){
        super( dim1,  dim2);
    }


    @Override
    void area(){
        System.out.println("Area of rectangle "+dim1*dim2);
    }
}

public class AbstractClass {
    public static void main(String[] args){
        figure fig;
        fig = new triangle(2,3);
        fig.area();
        fig = new rectangle(2,3);
        fig.area();
    }
}
