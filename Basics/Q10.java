// Q10 Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package Basics;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Operator You want to perform ('+','-','*','/')");

        char operator = sc.next().trim().charAt(0);

        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
            System.out.println("Enter first number");
            int n1 = sc.nextInt();
            System.out.println("Enter second number");
            int n2 = sc.nextInt();

            if (operator == '+') {
                System.out.println(n1 + n2);
            } else if (operator == '-') {
                System.out.println(n1 - n2);
            } else if (operator == '*') {
                System.out.println(n1 * n2);
            } else if (operator == '/') {
                if (n2 == 0) {
                    System.out.println("Dividing by 0 will give infinite value");
                } else {
                    System.out.println(n1 / n2);
                }
            }
        } else {
            System.out.println("Invalid Operator");
        }

    }
}
