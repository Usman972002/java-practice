package Basics;
// Q2 . Find Largest of the 3 given Numbers

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number :");
        n1 = sc.nextInt();
        System.out.print("Enter 2nd Number :");
        n2 = sc.nextInt();
        System.out.print("Enter 3rd Number :");
        n3 = sc.nextInt();

        // Method 1
        // if(n1>n2 && n1>n3){
        //     System.out.println(n1 + " Is Greatest");
        // }else if(n2>n3 && n2>n1){
        //     System.out.println(n2 +" Is Greatest");
        // }else{
        //     System.out.println(n3 + "Is Greatest");
        // }

        // Method 2 
        int max = n1;
        if(n2 > max){
            max = n2;
        }
        if(n3> max){
            max = n3;
        }
        System.out.println("The Greatest Number AMong" + n1 +"," + n2 + "," +n3 + " is :" +max);
    }
}
