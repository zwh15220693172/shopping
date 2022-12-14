package com.zvio.customer;

import com.zvio.bill.AppleBill;
import com.zvio.bill.BaseBill;
import com.zvio.bill.MangoBill;
import com.zvio.bill.StrawberryBill;
import com.zvio.register.CashRegister;
import com.zvio.register.NormalCashRegister;
import com.zvio.constant.FruitTypeConstant;
import com.zvio.strategy.StrawberryDiscountStrategy;

import java.util.Scanner;

/**
 * 顾客C，苹果，草莓，芒果，草莓打八折
 */
public class CustomerC extends Customer {
    public CustomerC(Scanner input) {
        super(input);
    }

    @Override
    public void shopping() {
        System.out.println("customer C start: ");
        /*初始化账单*/
        BaseBill appleBill = new AppleBill();
        BaseBill strawBerryBill = new StrawberryBill();
        BaseBill mangoBill = new MangoBill();
        /*初始化收银机*/
        CashRegister cashRegister = new NormalCashRegister();
        cashRegister.addBill(appleBill);
        cashRegister.addBill(strawBerryBill);
        cashRegister.addBill(mangoBill);
        cashRegister.setSellStrategy(new StrawberryDiscountStrategy());
        int quantityOfApple = getFruitQuantity(FruitTypeConstant.APPLE);
        int quantityOfStrawBerry = getFruitQuantity(FruitTypeConstant.STRAWBERRY);
        int quantityOfMango = getFruitQuantity(FruitTypeConstant.MANGO);
        appleBill.setQuantity(quantityOfApple);
        strawBerryBill.setQuantity(quantityOfStrawBerry);
        mangoBill.setQuantity(quantityOfMango);
        System.out.println("your total cost is " + cashRegister.calCost() + " RMB");
        System.out.println("customer C end");
    }
}
