import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
// Question
// https://www.hackerrank.com/challenges/java-strings-introduction/problem

public class JavaStringIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        A = A.substring(0,1).toUpperCase() + A.substring(1);
        System.out.println("A = " + A);
        String B=sc.next();
        sc.close();
        B = B.substring(0,1).toUpperCase() + B.substring(1);      
        System.out.println("B = " + B);

        /* Enter your code here. Print output to STDOUT. */
        int len = A.length() + B.length();
        System.out.println(len);
        if(A.compareTo(B) > 0){
            System.out.println("Yes");
        } 
        
        else{
            System.out.println("No");
        }
        
        String s = A.concat(" ").concat(B);
        System.out.println(s);
    }
}



