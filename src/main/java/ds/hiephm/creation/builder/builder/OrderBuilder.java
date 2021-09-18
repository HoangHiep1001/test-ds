package ds.hiephm.creation.builder.builder;

import ds.hiephm.creation.builder.oder.Order;
import ds.hiephm.creation.builder.type.BreadType;
import ds.hiephm.creation.builder.type.OrderType;
import ds.hiephm.creation.builder.type.VegetableType;

public class OrderBuilder implements Builder{
    private OrderType orderType;
    private BreadType breadType;
    private VegetableType vegetableType;

    public Builder orderType(OrderType type) {
        this.orderType = type;
        return this;
    }

    public Builder breadType(BreadType type) {
        this.breadType = type;
        return this;
    }

    public Builder vegetableType(VegetableType type) {
        this.vegetableType = type;
        return this;
    }

    public Order build() {
        return new Order(orderType, breadType, vegetableType);
    }
}
