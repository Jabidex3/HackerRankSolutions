package Easy;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem
//https://www.hackerrank.com/challenges/java-stdin-stdout/problem
public class JavaStdinAndStdout {

	public static void main(String[] args) {
		//Problem 1 Solution
		Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            System.out.println(scan.nextInt());
        }
        
        //Problem 2 Solution
        Scanner scanTwo = new Scanner(System.in);
        int i = scanTwo.nextInt();
        double d = scanTwo.nextDouble();
        scanTwo.nextLine();
        String s = scanTwo.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
	}

}
