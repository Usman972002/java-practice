// Q14 To find out whether the given Number is Palindrome or not.
package Basics;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to check for Palindrome :");
        int number = sc.nextInt();
        int temp = number;
        int reverse = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }

        if(reverse == temp){
            System.out.println(temp + "Is A Palindrome");
        }else{
            System.out.println(temp + "Is not a Palindrome");
        }
    }
}
