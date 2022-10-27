package bill;

import constant.FruitTypeConstant;
import constant.FruitUnitPrice;

/**
 * 苹果账单
 */
public class AppleBill implements BaseBill{
    private int quantity;

    @Override
    public double getUniPrice() {
        return FruitUnitPrice.APPLE;
    }

    @Override
    public String getType() {
        return FruitTypeConstant.APPLE;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int getQuantity() {
        return this.quantity;
    }
}
