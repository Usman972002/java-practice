// Q17 Take integer inputs till the user enters 0 and print the sum of all numbers
// and also print the largest number from all.
package Basics;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        int max = 0;
        while (true) {
            System.out.print("Enter a Number :");
            n = sc.nextInt();
            if(n == 0){
                break;
            }
            sum = sum + n;
            if(n > max){
                max = n;
            }
        }
        System.out.println("Sum of all numbers is :"+sum);
        System.out.println("Largest of all numbers is :"+max);
    }
}
