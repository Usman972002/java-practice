// Q15  To find Armstrong Number between two given number
package Basics;

import java.util.Scanner;

public class Q15ArmBtw2Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number :");
        int n1 = sc.nextInt();
        System.out.println("Enter Second Number :");
        int n2 = sc.nextInt();

        for (int i = n1; i<n2; i++){
            int check, rem, sum = 0;
            check = i;
            while(check != 0) {
               rem = check % 10;
               sum = sum + (rem * rem * rem);
               check = check / 10;
            }
            if(sum == i){
               System.out.println(""+i+" is an Armstrong number.");
            }
         }
    }    
}

