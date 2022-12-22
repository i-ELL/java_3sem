import package_6.Dish;
import package_4.Item;
import package_6.InternetOrder;
import package_6.OrderAlreadyAddedException;
import package_6.OrderManager;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws OrderAlreadyAddedException {
        var orderManager = new OrderManager();
        orderManager.add(
                "100", new InternetOrder(new Item[]{
                new Dish("pizza", "mm mm", 100),
                new Dish("coca-cola", "cola", 100),
        }));
        System.out.println(Arrays.toString(Arrays.stream(orderManager.getOrders()).toArray()));
    }
}