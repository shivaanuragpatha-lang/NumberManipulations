package com.java.numbers;
import java.util.Scanner;
public class numberManipulation {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int reverse = 0;
        int sum = 0;
        int product = 1;
        int evenCount = 0;
        int oddCount = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit %2 == 0) {
                evenCount=evenCount+1;
            }
            else {
                oddCount=oddCount+1;
            }
            if (digit > max) {
                max = digit;
            }
            if (digit < min) {
                min = digit;
            }
            reverse = reverse*10 + digit;
            sum = sum + digit;     //Calculating sum of digits of a given number
            product = product * digit; //Calculating product of digits in a given number
            num = num / 10;
        }
        System.out.println("Reverse of the given number:"+reverse);
        System.out.println("Sum of the digits in the given number:"+sum);
        System.out.println("Product of the digits in the given number:"+product);
        System.out.println("Number of even digits in the given number:"+evenCount);
        System.out.println("Number of odd digits in the given number:"+oddCount);

    }
}
