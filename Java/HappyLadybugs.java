package Easy;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/happy-ladybugs/problem
public class HappyLadybugs {

    static String happyLadybugs(String b) {
       String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_";
        HashMap<Character,Integer> holder = new HashMap<>();
        for(int i=0; i<alphabet.length();i++){
            holder.put(alphabet.charAt(i),0);
        }
        System.out.println(holder);
        for(int j=0; j<b.length();j++){
            holder.put(b.charAt(j),holder.get(b.charAt(j))+1);
        }
        System.out.println(holder);
        int numOpen = holder.get('_');
        System.out.println(numOpen);
        int occupiedIncludingOpen = 0;
        
        boolean work =true;
        for(char ch : holder.keySet()){
            if(ch=='_') {
                
            }
            else {
                if(holder.get(ch)==0){

                }
                else if(holder.get(ch)>1 || holder.get(ch)%2==0){
                    occupiedIncludingOpen+=holder.get(ch);
                }
                else{
                    occupiedIncludingOpen+=holder.get(ch);
                    work=false;
                }
            }
            
        }
        System.out.println(occupiedIncludingOpen);

        if(work == false){
            
            return "NO";
        }
        else if(numOpen>0 && work==true){
            return "YES";
        }
        else{
            return "NO";
        }
    }



    public static void main(String[] args) throws IOException {
        String x = "RBY_YBR";
        String sol =happyLadybugs(x);
        System.out.println(sol);
    }
}
