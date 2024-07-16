// Q16 Input a number and print all the factors of that number (use loops).
package Basics;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");

        int n = sc.nextInt();

        System.out.print("The Factors of :" + n + "are :");
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                System.out.print(i + ",");
            }
        }
    }
}
