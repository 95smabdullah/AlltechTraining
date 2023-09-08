package Day3.problem3;

public class CalcAverage {
    public double avgFirstN(int N){
        float avg = 0;
        try{
           if(N<=0){
               throw new IllegalArgumentException("N must be an integer greater than 0");

           } else {
               for(int i=1; i<=N; i++){
                   avg+=i;

               }
               System.out.println("average of the first "+N+" natural numbers is "+avg/N);


           }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        return avg/N;
    }
}
