package Basics;
// Q1 Print Numbers from 1 to n
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        System.out.print("Enter a Number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
