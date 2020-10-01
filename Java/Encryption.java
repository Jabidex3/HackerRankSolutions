package Medium;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/encryption/problem
public class Encryption {

	 static String encryption(String s) {
	        //System.out.println(s);
	        int rows = (int)Math.floor(Math.sqrt(s.length()));
	       // System.out.println(rows);
	        int col = (int)Math.ceil(Math.sqrt(s.length()));
	       // System.out.println(col);

	        if(rows*col<s.length()){
	            rows+=1;
	        }
	        
	        String[] code = new String[rows];
	        for(int i=0;i<rows;i++){
	            if(i < rows-1){
	                code[i]=s.substring(i*col,col*(i+1));
	            }
	            else{
	                code[i]=s.substring(i*col);
	            }
	            
	        }
//	         for(String str : code){
//	             System.out.println(str);
//	         }
	        String encryptedVal ="";
	        for(int j =0;j<col;j++){
	            for(int i = 0; i<rows;i++){
	                if(i != rows-1){
	                    encryptedVal+=code[i].charAt(j);
	                }
	                else{
	                    if(j<=code[i].length()-1){
	                        encryptedVal+=code[i].charAt(j);
	                    }
	                    else{

	                    }
	                }
	                
	            }
	            encryptedVal+=" ";
	        }
	        

	        return encryptedVal;

	    }
	
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		 BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
	        String s = scanner.nextLine();

	        String result = encryption(s);

	        bufferedWriter.write(result);
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	}

}
