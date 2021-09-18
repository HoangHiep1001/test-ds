package ds.hiephm.creation.builder.oder;

import ds.hiephm.creation.builder.type.BreadType;
import ds.hiephm.creation.builder.type.OrderType;
import ds.hiephm.creation.builder.type.VegetableType;

public class Order {
    private OrderType orderType;
    private BreadType breadType;
    private VegetableType vegetableType;

    public Order(OrderType orderType, BreadType breadType, VegetableType vegetableType) {
        this.orderType = orderType;
        this.breadType = breadType;
        this.vegetableType = vegetableType;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public void setBreadType(BreadType breadType) {
        this.breadType = breadType;
    }

    public VegetableType getVegetableType() {
        return vegetableType;
    }

    public void setVegetableType(VegetableType vegetableType) {
        this.vegetableType = vegetableType;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderType=" + orderType +
                ", breadType=" + breadType +
                ", vegetableType=" + vegetableType +
                '}';
    }
}
