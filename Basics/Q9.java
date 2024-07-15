// Q9 Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package Basics;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount :");
        int P = sc.nextInt();
        System.out.println("Enter Annual interest Rate :");
        int R = sc.nextInt();
        System.out.println("Enter Tenure (in years) :");
        int T = sc.nextInt();

        double simpleInterest = 0.0;

        simpleInterest = P * (1+ R * T);

        System.out.println("The Simple Interest is :" +simpleInterest);
    }    
}
