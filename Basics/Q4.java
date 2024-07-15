package Basics;
// Find the Nth Fibonacci Number 
// 0,1,1,2,3,5,.......

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.print("Enter a Number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1 ;

        if(n == 0){
            System.out.println(n + "th Fibonacci Number is :" +n);
            return;
        }

        if(n == 1){
            System.out.println(n + "th Fibonacci Number is :" +n);
            return;
        }

        int output = 0;
        for(int i = 2; i <= n; i++){
            output = a + b;
            a = b;
            b = output;
        }

        System.out.println(n + "th Fibonacci Number is :" +output);


    }
}
