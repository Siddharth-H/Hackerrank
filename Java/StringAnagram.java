import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

    // Insertion Sort
        static char[] sortChar(char[] a){
            int len = a.length;
            for(int i = 1;i<len; i++){
                int j = i - 1;
                char key = a[i];
                while( j >= 0 && a[j] > key){
                    // System.out.print("i = "+i+ " a = "+ Arrays.toString(a)+" j = "+ j + " key = "+key);
                    a[j+1] = a[j];
                    j--;
                    // System.out.println(" a = " + Arrays.toString(a) + " j = "+j);
                }
                a[j+1] = key;
            }
            return a;
        }
        static boolean isAnagram(String a, String b) {
            // Complete the function
            char[] s1 = a.toCharArray();
            char[] s2 = b.toCharArray();
            int len1 = s1.length;
            if(len1 != s2.length) return false;
            // System.out.println("s1 => "+ Arrays.toString(s1));
            // System.out.println("s2 => "+ Arrays.toString(s2));
            // System.out.println("---------Sorting String a-----------------");
            s1 = sortChar(s1);
            // System.out.println("---------Sorting String b-----------------");

            s2 = sortChar(s2);
            // System.out.println("--------------------------------After Sort-------------------------------------------------------------");
            // System.out.println("s1 => "+ Arrays.toString(s1));
            // System.out.println("s2 => "+ Arrays.toString(s2));
            int i =0;
            while(i < len1 ){
                if(s1[i] != s2[i]){
                    return false;
                }
                i++;
            }
            return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}