package Assessment1.Q1.com.store.test;

import Assessment1.Q1.com.store.Order;
import Assessment1.Q1.com.store.OrderServiceUtil;

public class TestClient {
    public static void main(String[] args) {
        OrderServiceUtil osu = new OrderServiceUtil();
        osu.addOrder(new Order(1,"A", 12, "CoD"));
        osu.addOrder(new Order(2,"B", 200, "InternetBanking"));
        osu.addOrder(new Order(3,"C", 300, "CoD"));
        System.out.println(osu.searchOrder(2).toString());
        System.out.println("Total Amount is "+osu.findTotal());
    }
}
