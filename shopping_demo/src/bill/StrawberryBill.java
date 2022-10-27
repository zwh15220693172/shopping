package bill;

import constant.FruitTypeConstant;
import constant.FruitUnitPrice;

/**
 * 草莓账单
 */
public class StrawberryBill implements BaseBill{
    private int quantity;

    @Override
    public double getUniPrice() {
        return FruitUnitPrice.STRAWBERRY;
    }

    @Override
    public String getType() {
        return FruitTypeConstant.STRAWBERRY;
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
