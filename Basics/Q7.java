// Q7 Write a program to print whether a number is even or odd, also take input from the user.
package Basics;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();

        if(n%2 == 0){
            System.out.println(n + " : is a Even Number");
        }else{
            System.out.println(n + " : is a Odd Number");            
        }
    }
}
