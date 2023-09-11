package Assessment1.Q1.com.store;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class OrderServiceUtil {

    static Map<Integer , Order> orderMap = new TreeMap<>();
    static Integer keygen = 0;
    public void addOrder(Order o){
        keygen++;
        orderMap.put(keygen,o);
    }

    public Order searchOrder(int OrderId){
        Order requiredOrder;
        Iterator<Order> itr = orderMap.values().iterator();
        while(itr.hasNext()){
            requiredOrder =  itr.next();
            if(requiredOrder.orderId == OrderId) {
                System.out.println("Found Order");
                return requiredOrder;

            }

        }
        System.out.println("Order Not Found");
        return null;
    }

    public float findTotal(){
        float total = 0.0f;
        for(Order o: orderMap.values()){
            total+= o.orderAmount;
        }
        return total;
    }


}
