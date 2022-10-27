package sale_strategy;

import bill.BaseBill;

import java.util.List;

/**
 * 满减销售策略
 */
public class FullDiscountStrategy implements SellStrategy {
    private final SellStrategy normalShellStrategy = new NormalSellStrategy();
    @Override
    public double calCost(List<BaseBill> bills) {
        double totalCost = normalShellStrategy.calCost(bills);
        int numberOfHundred = (int)totalCost / 100;
        totalCost -= 10 * numberOfHundred;
        return totalCost;
    }
}
