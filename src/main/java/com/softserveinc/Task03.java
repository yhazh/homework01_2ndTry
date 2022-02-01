package com.softserveinc;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Write your code here
        System.out.println("Write how many ml of water the coffee machine has:");
        System.out.print(">>> ");
        int w = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        System.out.print(">>> ");
        int m = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        System.out.print(">>> ");
        int cb = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        System.out.print(">>> ");
        int cups = scanner.nextInt();

        int cupCanBe = 0;
        int cupCanBeW = w / 200;
        int cupCanBeM = m / 50;
        int cupCanBeCb = cb / 15;
        cupCanBe = cupCanBeW;
        if (cupCanBeM < cupCanBe) {
            cupCanBe = cupCanBeM;
        }
        if (cupCanBeCb < cupCanBe) {
            cupCanBe = cupCanBeCb;
        }
        if (cups == cupCanBe) {
            System.out.println("Yes, I can make that amount of coffee");
        }
        else if (cups > cupCanBe){
            System.out.println("No, I can make only " + cupCanBe + " cup(s) of coffee");
        }
        else {
            System.out.println("Yes, I can make that amount of coffee (and even " + (cupCanBe - cups) + " more then that)");
        }
    }
}
