package Easy;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-string-reverse/problem
public class JavaStringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a Word to check if it is a palindrome:");
        String A=sc.next();
        StringBuilder str = new StringBuilder(A);
        String x = str.reverse().toString();
        if(A.equals(x)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
	}

}
