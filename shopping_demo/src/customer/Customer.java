package customer;

import util.InputChecker;
import util.PositiveInputChecker;

import java.util.Scanner;

public class Customer {
    protected static final Scanner input = new Scanner(System.in);
    protected static final InputChecker<String> inputChecker = new PositiveInputChecker();

    protected static int getFruitQuantity(String fruit) {
        boolean suitableCount = false;
        int quantityOfFruit = 0;
        while (!suitableCount) {
            System.out.print("please enter the quantity of "+fruit+": ");
            String quantityOfAppleStr = input.nextLine();
            if (inputChecker.checkInput(quantityOfAppleStr)) {
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
