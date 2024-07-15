package Basics;
// Q3. Given a character , say if it is in UpperCase Or Lower Case

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.print("Enter a Character :");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println(ch + " : is in LowerCase");
        }else if(ch >='A' && ch <='Z'){
            System.out.println(ch + " : is in UpperCase");
        }else{
            System.out.println(ch+" : is not an Alphabet");
        }
    }
}
