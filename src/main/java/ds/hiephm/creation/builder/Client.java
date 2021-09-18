package ds.hiephm.creation.builder;

import ds.hiephm.creation.builder.builder.OrderBuilder;
import ds.hiephm.creation.builder.oder.Order;
import ds.hiephm.creation.builder.type.BreadType;
import ds.hiephm.creation.builder.type.OrderType;
import ds.hiephm.creation.builder.type.VegetableType;

public class Client {
    public static void main(String[] args) {
        OrderBuilder orderBuilder = new OrderBuilder();
        Order order = orderBuilder.orderType(OrderType.ON_SITE).breadType(BreadType.MEAT).vegetableType(VegetableType.CUCUMBER).build();
        System.out.println(order.toString());
    }
}
