package Day4.ThreadExamples;

public class SingleThreaded {
    public static void main(String[] args){
        SingleThreaded st = new SingleThreaded();
        st.printNumbers();
        for(int j=0;j<20;j++) {
            System.out.println("j: " + j + "\t");
        }

    }
    void printNumbers(){
        for(int i=0;i<20;i++){
            System.out.println("i: "+i+"\t");
        }
    }
}
