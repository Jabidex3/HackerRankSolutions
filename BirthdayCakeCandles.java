package Easy;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/birthday-cake-candles/problem
public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int[] ar) {
        HashMap<Integer,Integer> candles = new HashMap<>();
        
        List<Integer> arrList = new ArrayList<Integer>(ar.length);
        for (int i : ar)
        {
            arrList.add(i);
        }
        HashSet<Integer> noDupes = new HashSet<>(arrList);
        for(Integer i : noDupes ){
            candles.put(i,0);
        }

        for(Integer i:arrList){
            candles.put(i,candles.get(i)+1);
        }

        int highestNum = -1;
        for(int i: candles.keySet()){
            if(i>highestNum){
                highestNum = i;
            }
        }

        return candles.get(highestNum);

    }
    
    public static String printArr(int[]arr) {
    	String s ="{";
    	for(int i:arr) {
    		s+=i;
    		s+=" ";
    	}
    	s+="}";
    	return s;
    }

    public static void main(String[] args) throws IOException {
    	int[] arr = {3,2,1,3, 4,4,3,3,2,5,4,5};
    	System.out.println("Array passsed in : "+ printArr(arr)+ "\nNumber of candles blown out: " + birthdayCakeCandles(arr));
    }
}

