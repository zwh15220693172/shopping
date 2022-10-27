package cash_register;

import bill.BaseBill;
import sale_strategy.SellStrategy;

/**
 * 收银机
 */
public interface CashRegister {
    /**
     * 计算总额
     */
    double calCost();

    /**
     * 添加账单
     */
    void addBill(BaseBill bill);

    /**
     * 删除账单
     */
    void removeBill(BaseBill bill);

    /**
     * 设置销售策略
     */
    void setSellStrategy(SellStrategy sellStrategy);
}
