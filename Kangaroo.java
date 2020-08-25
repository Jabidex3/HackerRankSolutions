package Easy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/kangaroo/problem
public class Kangaroo  
{
    static String kangaroo(int x1, int v1, int x2, int v2) {
        double x = 0;
        double y =0;
        if(v1==v2){
            if(x1==x2){
                return "YES";
            }
            else{
                return "NO";
            }
        }
        else if(v2>v1){
            x=v2-v1;
            y=x1-x2;
            if(x>1){
                y /= x;
                if(y>=0){
                    int a = (int)y;
                    if(a==y){
                        return "YES";
                    }
                    else{
                        return "NO";
                    }
                    
                }
                else{
                    return "NO";
                }
            }
            else{
                  if(y>=0){
                    return "YES";
                }
                else{
                    return "NO";
                }
            }
        }
        else{
            x = v1-v2;
            y=x2-x1;
            if(x>1){
                y /= x;
                if(y>=0){
                    int b = (int)y;
                    if(b==y){
                        return "YES";
                    }
                    else{
                        return "NO";
                    }
                }
                else{
                    return "NO";
                }
            }
            else{
                if(y>=0){
                    return "YES";
                }
                else{
                    return "NO";
                }
            }
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    	 BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    	 System.out.println("Please enter the 4 values each separated by  space:");
        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

