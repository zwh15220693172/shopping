package sale_strategy;

import bill.BaseBill;
import constant.FruitTypeConstant;

import java.util.List;

/**
 * 草莓打折策略
 */
public class StrawberryDiscountStrategy implements SellStrategy{
    @Override
    public double calCost(List<BaseBill> bills) {
        return bills.stream().mapToDouble((bill)->{
            if (FruitTypeConstant.STRAWBERRY.equals(bill.getType())) {
                return (int)(bill.getUniPrice() * bill.getQuantity() * 0.8 * 100) / 100.00;
            } else {
                return bill.getUniPrice() * bill.getQuantity();
            }
        }).sum();
    }
}
