import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagContentExtracter{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	//Write your code here
            String[] line_strings = line.split("{[<][a-zA-Z]+[>] | [<][/][a-zA-Z]+[>]}");

            System.out.println(Arrays.toString(line_strings));
			testCases--;
		}
	}
}



