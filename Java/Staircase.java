package Easy;

//https://www.hackerrank.com/challenges/staircase/problem
public class Staircase {
	

	 static void staircase(int n) {
	        int max = n;
	        int min =1;
	        while(min <= max){
	            for(int i =0;i<(max-min);i++){
	                    System.out.print(" ");
	            }
	            for(int i=0;i<min;i++){
	                System.out.print("#");
	            }
	            System.out.println();
	            min+=1;
	        }
	 }
	        
	public static void main(String[] args) {
		Staircase.staircase(6);
	}

}
