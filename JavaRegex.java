package Medium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class MyRegex{
    String pattern = "^([0-9]|[0-9][0-9]|[0-2][0-4][0-9]|[0-2][0-5][0-5])\\.([0-9]|[0-9][0-9]|[0-2][0-4][0-9]|[0-2][0-5][0-5])\\.([0-9]|[0-9][0-9]|[0-2][0-4][0-9]|[0-2][0-5][0-5])\\.([0-9]|[0-9][0-9]|[0-2][0-4][0-9]|[0-2][0-5][0-5])$";
}

//https://www.hackerrank.com/challenges/java-regex/problem
public class JavaRegex {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        while(true){
        	System.out.println("Please enter an IP Address to validate:");
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
	}

}
