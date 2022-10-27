package cash_register;

import bill.BaseBill;
import sale_strategy.SellStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 普通收银机
 */
public class NormalCashRegister implements CashRegister{
    private final List<BaseBill> bills = new ArrayList<>();
    private SellStrategy sellStrategy;

    @Override
    public double calCost() {
        if (sellStrategy == null) {
            return 0;
        }
        return sellStrategy.calCost(bills);
    }

    @Override
    public void addBill(BaseBill bill) {
        bills.add(bill);
    }

    @Override
    public void removeBill(BaseBill bill) {
        bills.remove(bill);
    }

    @Override
    public void setSellStrategy(SellStrategy sellStrategy) {
        this.sellStrategy = sellStrategy;
    }
}
