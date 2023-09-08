package Day2;

public class GCDemo {
    int objId;
    public GCDemo(int objId){
        this.objId = objId;
    }
    public static void main(String[] args){
        for(int i = 1; i<=395000; i++){
            new GCDemo(i);
        }
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Finalize " + objId);
    }
}
