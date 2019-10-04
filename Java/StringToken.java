import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Pattern;

public class StringToken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        // String[] arr = new String[];
        // char[] c = s.toCharArray();
        // int j =0;
        // String[] arr = s.split("[\\W]");
        // s.replaceAll("_", "");
        // s.replaceAll("[\\W]","");
        String[] strings = s.split("\\W");
        ArrayList<String> arr = new ArrayList(Arrays.asList(strings));
        // System.out.println("strings = "+ strings);
        // Iterator<String> it = arr.iterator();
        // while(it.hasNext()){
        //     String value = it.next();
        //     if(value.trim().isEmpty()){
        //         it.remove();
        //     }
        // }
        // System.out.println("arr[0] = "+ arr.get(0));
        // for(String x : arr){
        //     if(x.trim().isEmpty()){
        //         arr.remove(x);
        //     }
        // }
        // arr.replaceAll("_"," ");
        for (int i = 0; i < arr.size(); i++) {
            String x = arr.get(i);
            System.out.println("-->>"+ x + "<<--");
            x.replaceAll("_", "");
            if(!x.matches("[a-zA-Z0-9]")){
                System.out.println("Inside If-->>"+x+"<<<<<<<");
                System.out.println("Removed = "+arr.remove(i));
                i--;
            

            }
            // if(arr.get(i).matches("\\W"){
            //     arr.remove(i);
            // }
            
        }
        
        // while(arr.remove(""));
        // while(arr.remove("_"));
        
        // arr.removeIf(name -> name.startsWith("\\W"));
        
        // String[] arr = s.split("^[a-zA-Z]");
        // String[] arr = s.split("\\s+(?=[),'])");
        // System.out.println(arr);
        System.out.println(arr.size());
        for (String str : arr) {
            System.out.println(">>" + str + "<<");            
        }

        // for (int i =0; i<c.length; i++) {
        //     if(Pattern.matches([ *\d\s]], char))
        // }
    }
}

