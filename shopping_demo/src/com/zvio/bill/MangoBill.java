package com.zvio.bill;

import com.zvio.constant.FruitTypeConstant;
import com.zvio.constant.FruitUnitPrice;

/**
 * 芒果账单
 */
public class MangoBill implements BaseBill {
    private int quantity;
    @Override
    public double getUniPrice() {
        return FruitUnitPrice.MANGO;
    }

    @Override
    public String getType() {
        return FruitTypeConstant.MANGO;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }
}
