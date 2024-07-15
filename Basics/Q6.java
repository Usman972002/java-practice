package Basics;
// Q5 Given A Number You need to print the reverse of that number 

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        System.out.print("Enter a Number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int ans = 0;
         while(n>0){
            int lastDigit = n %10;
            ans = ans * 10 + lastDigit;
            n = n / 10;
         }
         System.out.println("The Reverse of the Number :" + temp + "Is :" +ans);
    }    
}
