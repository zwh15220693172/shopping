package com.zvio.customer;
import com.zvio.bill.AppleBill;
import com.zvio.bill.BaseBill;
import com.zvio.bill.MangoBill;
import com.zvio.bill.StrawberryBill;
import com.zvio.register.CashRegister;
import com.zvio.register.NormalCashRegister;
import com.zvio.constant.FruitTypeConstant;
import com.zvio.strategy.FullDiscountStrategy;

import java.util.Scanner;

/**
 * 顾客D：苹果，草莓，芒果，满100减10元
 */
public class CustomerD extends Customer{

    public CustomerD(Scanner input) {
        super(input);
    }

    @Override
    public void shopping() {
        System.out.println("customer D start: ");
        /*初始化账单*/
        BaseBill appleBill = new AppleBill();
        BaseBill strawBerryBill = new StrawberryBill();
        BaseBill mangoBill = new MangoBill();
        /*初始化收银机*/
        CashRegister cashRegister = new NormalCashRegister();
        cashRegister.addBill(appleBill);
        cashRegister.addBill(strawBerryBill);
        cashRegister.addBill(mangoBill);
        cashRegister.setSellStrategy(new FullDiscountStrategy());
        int quantityOfApple = getFruitQuantity(FruitTypeConstant.APPLE);
        int quantityOfStrawBerry = getFruitQuantity(FruitTypeConstant.STRAWBERRY);
        int quantityOfMango = getFruitQuantity(FruitTypeConstant.MANGO);
        appleBill.setQuantity(quantityOfApple);
        strawBerryBill.setQuantity(quantityOfStrawBerry);
        mangoBill.setQuantity(quantityOfMango);
        System.out.println("your total cost is " + cashRegister.calCost() + " RMB");
        System.out.println("customer D end");
    }
}
