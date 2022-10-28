package com.zvio;

import com.zvio.customer.*;

import java.util.Scanner;
import static com.zvio.util.InputStrCheckUtil.checkInput;
import static com.zvio.util.InputStrCheckUtil.illegalNum;

/**
 * 启动测试
 */
public class Main {
    protected static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        shoppingStart();
    }

    /**
     * 开始购物
     */
    private static void shoppingStart() {
        boolean rightCustomer = false;
        String numStr = "";
        while (!rightCustomer) {
            System.out.print("please choose the custer you want(1:A, 2:B, 3:C, 4:D) : ");
            numStr = input.nextLine();
            if (!checkInput(numStr) || illegalNum(numStr)) {
                System.out.println("enter wrong number");
            } else {
                rightCustomer =  true;
            }
        }
        int inputNum = Integer.parseInt(numStr);
        Customer customer = null;
        switch (inputNum) {
            case 1:
                customer = new CustomerA(input);
                break;
            case 2:
                customer = new CustomerB(input);
                break;
            case 3:
                customer = new CustomerC(input);
                break;
            case 4:
                customer = new CustomerD(input);
                break;
        }
        customer.shopping();
    }
}
