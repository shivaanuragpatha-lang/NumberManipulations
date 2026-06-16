package com.java.numbers;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int num = sc.nextInt();
        int original = num;
        int count = 0;
        int sum = 0;
        int temp = num;

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        temp = num;
        if(temp>0){
            int digit = temp % 10;
            sum += (int) Math.pow(digit,count);
            temp = temp/10;
        }
        if (sum == original) {
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not Armstrong Number");
        }
    }
}
