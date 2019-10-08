import java.io.*;
import java.util.*;

public class ArrayList2D {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // ArrayList<Integer,Integer> arr = new ArrayList<Intger,Integer>
        // ArrayList[][] arr = new ArrayList[][n];
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        try{
            for(int i=0;i<n;i++){
                int m = scan.nextInt();
                arr.add(new ArrayList<Integer>());
                for(int j =0; j<m ;j++){
                    arr.get(i).add(scan.nextInt());
                }
            }
            int no_of_test = scan.nextInt();
            for(int i=0;i<no_of_test;i++){
                int x = scan.nextInt();
                int y = scan.nextInt();
                try{
                    System.out.println(arr.get(x-1).get(y-1));
                }catch(Exception e){
                    System.out.println("ERROR!");
                }
            }
        }catch(Exception e){
            System.out.println("Exception = " + e);
        }
    
    }
}

