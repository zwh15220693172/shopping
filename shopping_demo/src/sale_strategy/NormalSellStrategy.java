package sale_strategy;

import bill.BaseBill;

import java.util.List;

/**
 * 普通销售策略
 */
public class NormalSellStrategy implements SellStrategy {
    @Override
    public double calCost(List<BaseBill> bills) {
        return bills.stream()
                .mapToDouble((bill)->bill.getQuantity() * bill.getUniPrice())
                .sum();
    }
}
