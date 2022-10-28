package com.zvio.customer;

import java.util.Scanner;

import static com.zvio.util.InputStrCheckUtil.checkInput;

/**
 * 顾客对象
 */
public abstract class Customer {
    protected Scanner input;

    protected Customer(Scanner input) {
        this.input = input;
    }
    public abstract void shopping();

    /**
     * 根据水果获取水果数量
     */
    protected int getFruitQuantity(String fruit) {
        boolean suitableCount = false;
        int quantityOfFruit = 0;
        while (!suitableCount) {
            System.out.print("please enter the quantity of "+fruit+": ");
            String quantityOfAppleStr = this.input.nextLine();
            if (checkInput(quantityOfAppleStr)) {
                quantityOfFruit = Integer.parseInt(quantityOfAppleStr);
                suitableCount = true;
            } else {
                System.out.print("you enter wrong quantity! ");
                System.out.println();
            }
        }
        return quantityOfFruit;
    }
}
