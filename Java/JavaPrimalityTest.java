package Easy;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/java-primality-test/problem
public class JavaPrimalityTest {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("Please Enter an Integer you would like to check for primality:");
        String n = scanner.nextLine();
        BigInteger x = new BigInteger(n);
        if(x.isProbablePrime(1)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        scanner.close();
    }
}
