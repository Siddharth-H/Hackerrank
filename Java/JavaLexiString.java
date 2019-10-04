import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class JavaLexiString {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        int loops = s.length() - k + 1 ;
        // ArrayList<String> strings = new ArrayList<String>();
        // // System.out.println("loops = "+ loops);
        // for(int i = 0; i < loops ; i++){
            
        //     strings.add(i,s.substring(i,i+k));
        //     // System.out.println(i + " = " + strings.get(i));

        // }
        // Collections.sort(strings);
        // // System.out.println();
        // // Arrays.sort(strings);
        // // System.out.println("After sort = " + strings);
        // smallest = strings.get(0);
        // largest = strings.get(strings.size() - 1 );
        int i = 0;
        String[] str = new String[loops];
        while(i<loops){
            str[i] = s.substring(i, i + k);
            // System.out.println("i =  "+ i + " k = " + k + " str[i]" + "= " + str[i] + " loop = " + loops);
            // int j = 0;
            // // System.out.println("first elememt = " + str[j] + " Compare = " + !str[j].isEmpty());
            // while(j<i) {
            //     // System.out.println("compare  = " + str[i].compareTo(str[j]));
            //     if(str[i].compareTo(str[j]) < 0){
            //         String temp = str[i];
            //         str[i] = str[j];
            //         str[j] = temp;
            //     }
            //     j++;
            // }
            i++;
        }
        largest = str[0];
        smallest = str[0];
        for (String var : str) {
            if(largest.compareTo(var) < 0){
                largest = var;
            }
            if(smallest.compareTo(var) > 0){
                smallest = var;
            }
        }
        // System.out.println("------------------------------------------------------");
        for (String var : str) {
            System.out.print(var + " ");
        }
        // System.out.println("----------------------------------");
        smallest = str[0];
        largest = str[loops-1];
        return smallest + "\n" + largest;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.print(getSmallestAndLargest(s, k));
    }
}

