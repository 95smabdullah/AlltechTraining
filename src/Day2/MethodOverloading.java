package Day2;



public class MethodOverloading {
    public void makePayment(String bankName, String userId){
        System.out.println("Pay from Net Banking");
    }
    public void makePayment(int mobileNumber){
        System.out.println("Pay from UPI");
    }
    public void makePayment(String bankName, int creditCardNo){
        System.out.println("Pay from credit card");
    }
    public static void main(String[] args){
        MethodOverloading mo = new MethodOverloading();
        mo.makePayment(716907887);
        mo.makePayment("BOFA", 213132);
        mo.makePayment("BOFA","ME");

    }
}
