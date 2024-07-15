package Basics;
// Q5. Counting Occurances 

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = sc.nextInt();
        System.out.print("Enter Number to find Occurance :");
        int key = sc.nextInt();
        int count = 0;
        int temp = n;

        while (n > 0) {
            int lastDigit = n %10 ;
            if(lastDigit == key){
                count++;
            }
            n = n/10;
        }

        System.out.println("The Number Of Occurances in :"+ temp +": is :" +count);
        
    }
}
