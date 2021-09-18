package ds.hiephm.creation.builder.builder;

import ds.hiephm.creation.builder.oder.Order;
import ds.hiephm.creation.builder.type.BreadType;
import ds.hiephm.creation.builder.type.OrderType;
import ds.hiephm.creation.builder.type.VegetableType;

public interface Builder {
    Builder orderType(OrderType type);
    Builder breadType(BreadType type);
    Builder vegetableType(VegetableType type);
    Order build();
}
