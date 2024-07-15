// Q12 Input currency in rupees and output in USD.
package Basics;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Amount in Inidan Rupees");
        double inr = sc.nextDouble();

        double usd = inr / 83.54 ;

        System.out.println("The Amount in Indian Rupees is :" + inr + " and in USD is :"+usd);
    }
}
