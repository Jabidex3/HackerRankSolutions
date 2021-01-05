package Easy;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/strong-password/problem
public class StrongPassword {
	static int minimumNumber(int n, String password) {
		// Return the minimum number of characters to make the password strong

		String numbers = "0123456789";
		String lower_case = "abcdefghijklmnopqrstuvwxyz";
		String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String special_characters = "!@#$%^&*()-+";

		boolean sixNumMin = false;
		boolean numberPresent = false;
		boolean lowercasePresent = false;
		boolean uppercasePresent = false;
		boolean specialPresent = false;

		if (password.length() > 6) {
			sixNumMin = true;
		}

		StringBuilder sb = new StringBuilder(password);
		for (int i = 0; i < sb.length(); i++) {
			if (numbers.indexOf(sb.charAt(i)) != -1) {
				numberPresent = true;
			}
			if (lower_case.indexOf(sb.charAt(i)) != -1) {
				lowercasePresent = true;
			}

			if (upper_case.indexOf(sb.charAt(i)) != -1) {
				uppercasePresent = true;
			}

			if (special_characters.indexOf(sb.charAt(i)) != -1) {
				specialPresent = true;
			}

		}

		int numCharacterNeededToAdd = 0;
		if (specialPresent == false) {
			numCharacterNeededToAdd += 1;
		}
		if (uppercasePresent == false) {
			numCharacterNeededToAdd += 1;
		}
		if (lowercasePresent == false) {
			numCharacterNeededToAdd += 1;
		}
		if (numberPresent == false) {
			numCharacterNeededToAdd += 1;
		}
		if (sixNumMin == false) {
			if (password.length() + numCharacterNeededToAdd < 6) {
				int add = 6 - (password.length() + numCharacterNeededToAdd);
				numCharacterNeededToAdd += add;
			}

		}

		return numCharacterNeededToAdd;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your password and we will determine if its strong:");
		String pw = scan.nextLine();
		if(minimumNumber(pw.length(),pw)==0) {
			System.out.println("You have entered a strong password! No other characters are required!");
		}
		else {
			System.out.println("You need "+minimumNumber(pw.length(),pw)+" character(s) to make this into a strong password!" );
		}
	}

}
