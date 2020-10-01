package Medium;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/the-time-in-words/problem
public class TheTimeInWords {

    static String timeInWords(int h, int m) {
        String [] hours = {"zero", "one",        "two",        "three",        "four",
        "five",        "six",        "seven",        "eight",
        "nine",        "ten",        "eleven",        "twelve"};

        String[] minutes = {"zero", 
        "one",        "two",        "three",        "four",
        "five",        "six",        "seven",        "eight",
        "nine",        "ten",        "eleven",        "twelve",
        "thirteen",        "fourteen",        "quarter",        "sixteen",
        "seventeen",        "eighteen",        "nineteen",        "twenty",
        "twenty one",        "twenty two",        "twenty three",        "twenty four",
        "twenty five",        "twenty six",        "twenty seven",        "twenty eight",
        "twenty nine",        "half"};

    String output = "";
    if(m==0){
        output+= hours[h] + " o' clock";
    }
    else if(m>=1 && m<=30){
        if(m ==1){
            output+= minutes[m]+ " minute past " + hours[h];
        }
        else if(m==15 || m == 30){
                output+= minutes[m] + " past " + hours[h];
        }
        else{
            output+= minutes[m]+ " minutes past " + hours[h];
        }
    }
    else{
        int t = 60-m;
        if(t==15){
            output+= minutes[t]+ " to " + hours[h+1];
        }
        else{
            output+= minutes[t]+ " minutes to " + hours[h+1];
        }
        
    }

    return output;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	System.out.println("Welcome to the Time Converter!");
    	System.out.println("------------------------------");
    	System.out.println("Please enter the hour: ");
        int h = scanner.nextInt();
        System.out.println("Please enter the minutes: ");
        int m = scanner.nextInt();
        
        System.out.println("The Current Time Is: " +timeInWords(h,m));
      

        scanner.close();
    }
}
