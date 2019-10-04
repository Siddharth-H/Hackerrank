import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        // ArrayList<String> p = new ArrayList<>();
        while(testCases>0){
			String pattern = in.nextLine();
              //Write your code
          
            try{
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");
                
            }catch(Exception e){
                System.out.println("Invalid");
            }  
            testCases--;
        } 
	}
}



