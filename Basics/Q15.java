// Q15  To find Armstrong Number between two given number
package Basics;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();
        int temp = n;
        int ans = 0;
        while (n > 0) {
            int last = n % 10;
            ans = ans + (last * last * last);
            n = n / 10;
        }

        if(temp == ans){
            System.out.println(temp +" Is a Armstrong Number");
        }else{
            System.out.println(temp + " Is not an Armstrong Number");
        }
    }
}
