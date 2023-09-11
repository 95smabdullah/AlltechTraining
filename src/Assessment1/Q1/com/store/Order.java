package Assessment1.Q1.com.store;

import java.util.ArrayList;

public class Order{
    public int orderId;
    public String customerName;
    public float orderAmount;
    public String paymentOption;
    final static ArrayList<String> paymentOptions = new ArrayList<>(){
        {
            add("CoD");
            add("GiftCard");
            add("InternetBanking");
        }};

    public Order(int orderId, String customerName, float orderAmount, String paymentOption) {
        try{
        if(orderAmount<100) {
            throw new InvalidOrderException("Order Amount cant be less than 100");
        } else if (!paymentOptions.contains(paymentOption) ) {
            throw new InvalidOrderException("Payment option must be from the following: "+paymentOptions.toString());
        } else {
            this.orderId = orderId;
            this.customerName = customerName;
            this.orderAmount = orderAmount;
            this.paymentOption = paymentOption;
        }
        } catch (InvalidOrderException e) {
            System.out.println(e);
        }

    }

    @Override
    public String toString(){
        return "OrderID: "+this.orderId+"  Customer: "+this.customerName+"  Amount: "+this.orderAmount+"  Payment Method: "+this.paymentOption;
    }

}
