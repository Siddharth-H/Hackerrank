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
        
        int loops = s.length() - k ;
        ArrayList<String> strings = new ArrayList<String>();
        // System.out.println("loops = "+ loops);
        for(int i = 0; i < loops ; i++){
            
            strings.add(i,s.substring(i,i+k));
            // System.out.println(i + " = " + strings.get(i));

        }
        Collections.sort(strings);
        // System.out.println();
        // Arrays.sort(strings);
        // System.out.println("After sort = " + strings);
        smallest = strings.get(0);
        largest = strings.get(strings.size() -1 );
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

