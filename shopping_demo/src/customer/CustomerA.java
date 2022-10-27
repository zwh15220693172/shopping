package customer;

import bill.AppleBill;
import bill.BaseBill;
import bill.StrawberryBill;
import cash_register.CashRegister;
import cash_register.NormalCashRegister;
import constant.FruitTypeConstant;
import sale_strategy.NormalSellStrategy;

public class CustomerA extends Customer {

    public static void main(String[] args) {
        /*初始化条件*/
        BaseBill appleBill = new AppleBill();
        BaseBill strawBerryBill = new StrawberryBill();
        CashRegister cashRegister = new NormalCashRegister();
        cashRegister.addBill(appleBill);
        cashRegister.addBill(strawBerryBill);
        cashRegister.setSellStrategy(new NormalSellStrategy());
        while (true) {
            int quantityOfApple = getFruitQuantity(FruitTypeConstant.APPLE);
            int quantityOfStrawBerry = getFruitQuantity(FruitTypeConstant.STRAWBERRY);
            appleBill.setQuantity(quantityOfApple);
            strawBerryBill.setQuantity(quantityOfStrawBerry);
            System.out.println("your total cost is " + cashRegister.calCost() + " RMB");
        }
    }
}
