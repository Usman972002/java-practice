// Q13 To calculate Fibonacci Series up to n numbers.
package Basics;

import java.util.Scanner;

public class Q13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a Number :");
    int n = sc.nextInt();

    int a = 0;
    int b = 1;
    System.out.print(a +","+b +",");
    int count = 2;
    while (count <=n) {
        int temp = b;
        b = b + a;
        System.out.print(b +",");
        a = temp;
        count++;       
    }
  }  
}
