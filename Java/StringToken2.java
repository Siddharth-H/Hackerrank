import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Pattern;

public class StringToken2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        // String[] arr = new String[];
        // char[] c = s.toCharArray();
        // int j =0;
        // String[] arr = s.split("[\\s;'.,?@]");
        // String[] arr = s.split("\\W");
        String[] strings = s.split("\\W");
        // System.out.println("After Split = " + Arrays.toString(strings));
        ArrayList<String> arr = new ArrayList(Arrays.asList(strings));
        // System.out.println("strings = "+ strings);
        // Iterator<String> it = arr.iterator();
        // while(it.hasNext()){
        //     String value = it.next();
        //     if(value.trim().isEmpty()){
        //         it.remove();
        //     }
        // }
        // for(String x : arr){
        //     if(x.trim().isEmpty()){
        //         arr.remove(x);
        //     }
        // }
        for (int i = 0; i < arr.size(); i++) {
            String x = arr.get(i);
            if(!x.matches("[a-zA-Z0-9]+")){
                arr.remove(i); 
                i--;
            }
        }
        // while(arr.remove(""));
        // System.out.println(Arrays.toString(arr) + " length = "+arr.length);
        System.out.println(arr.size());
        for (String str : arr) {
            System.out.println(str);            
        }

    }
}

