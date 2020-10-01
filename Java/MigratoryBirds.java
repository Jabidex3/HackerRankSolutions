package Easy;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

//https://www.hackerrank.com/challenges/migratory-birds/problem
public class MigratoryBirds {

	  // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        TreeSet<Integer> noDupes = new TreeSet<Integer>(arr);
        TreeMap<Integer,Integer> birds = new TreeMap<>();
        for(Integer i : noDupes){
            birds.put(i,0);
        }

        for(Integer i: arr){
            birds.put(i, birds.get(i) + 1);
        }

        System.out.println(birds);
        Integer lowestKey = -1;
        Integer frequency =-1;
        for(Integer i:noDupes){
            if(frequency==-1){
                lowestKey =i;
                frequency=birds.get(i);
            }
            else if(birds.get(i)>frequency){
                lowestKey =i;
                frequency=birds.get(i);
            }
        }

        return lowestKey;
    }

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		System.out.println("Plese enter array length:");
		//bufferedWriter.write("Plese enter array length:");
		//bufferedWriter.newLine();
        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
        
        //bufferedWriter.write("Plese enter array values separated by a space:");
        //bufferedWriter.newLine();
        System.out.println("Plese enter array values separated by a space character:");
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = migratoryBirds(arr);
        bufferedWriter.write("The Most Common Bird with the lowest id number is:");
        bufferedWriter.newLine();
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
	}

}

