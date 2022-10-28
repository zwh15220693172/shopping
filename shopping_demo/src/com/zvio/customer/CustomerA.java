package com.zvio.customer;

import com.zvio.bill.AppleBill;
import com.zvio.bill.BaseBill;
import com.zvio.bill.StrawberryBill;
import com.zvio.register.CashRegister;
import com.zvio.register.NormalCashRegister;
import com.zvio.constant.FruitTypeConstant;
import com.zvio.strategy.NormalSellStrategy;

import java.util.Scanner;

/**
 * 顾客A，苹果，草莓
 */
public class CustomerA extends Customer {
    public CustomerA(Scanner input) {
        super(input);
    }

    @Override
    public void shopping() {
        System.out.println("customer A start: ");
        BaseBill appleBill = new AppleBill();
        BaseBill strawBerryBill = new StrawberryBill();
        CashRegister cashRegister = new NormalCashRegister();
        cashRegister.addBill(appleBill);
        cashRegister.addBill(strawBerryBill);
        cashRegister.setSellStrategy(new NormalSellStrategy());
        int quantityOfApple = getFruitQuantity(FruitTypeConstant.APPLE);
        int quantityOfStrawBerry = getFruitQuantity(FruitTypeConstant.STRAWBERRY);
        appleBill.setQuantity(quantityOfApple);
        strawBerryBill.setQuantity(quantityOfStrawBerry);
        System.out.println("your total cost is " + cashRegister.calCost() + " RMB");
        System.out.println("customer A end ~~~");
    }
}
