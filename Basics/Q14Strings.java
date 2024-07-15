// Q14 
package Basics;

import java.util.Scanner;

public class Q14Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to check for Palindrome :");
       String str = sc.next();

       String temp = str ;
       String rev = "";

       for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            rev = rev + ch;
       }

       if(temp.equals(rev)){
        System.out.println(str + "Is a Palindrome");
       }else{
        System.out.println(str+"Is Not a Palindrome");
       }
    }
}
