package customer;

import bill.AppleBill;
import bill.BaseBill;
import bill.MangoBill;
import bill.StrawberryBill;
import cash_register.CashRegister;
import cash_register.NormalCashRegister;
import constant.FruitTypeConstant;
import sale_strategy.StrawberryDiscountStrategy;

public class CustomerC extends Customer {
    public static void main(String[] args) {
        /*初始化账单*/
        BaseBill appleBill = new AppleBill();
        BaseBill strawBerryBill = new StrawberryBill();
        MangoBill mangoBill = new MangoBill();
        /*初始化收银机*/
        CashRegister cashRegister = new NormalCashRegister();
        cashRegister.addBill(appleBill);
        cashRegister.addBill(strawBerryBill);
        cashRegister.addBill(mangoBill);
        cashRegister.setSellStrategy(new StrawberryDiscountStrategy());
        while (true) {
            int quantityOfApple = getFruitQuantity(FruitTypeConstant.APPLE);
            int quantityOfStrawBerry = getFruitQuantity(FruitTypeConstant.STRAWBERRY);
            int quantityOfMango = getFruitQuantity(FruitTypeConstant.MANGO);
            appleBill.setQuantity(quantityOfApple);
            strawBerryBill.setQuantity(quantityOfStrawBerry);
            mangoBill.setQuantity(quantityOfMango);
            System.out.println("your total cost is " + cashRegister.calCost() + " RMB");
        }
    }
}
