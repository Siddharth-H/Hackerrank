import java.io.*;
import java.util.*;

public class Stringpalindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int i =0;
        int len = A.length();
        int j = len - i ;
        boolean isPalindrome = true;
        while(i<=len/2){
            if(A.charAt(i) != A.charAt(len-i-1)){
                isPalindrome = false;
                break;
            }
            i++;
        }
        if (isPalindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}



