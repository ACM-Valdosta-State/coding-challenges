package Beginner;

import java.util.Random;
import java.util.Scanner;

public class ReplaceCharacter {
	public static void main(String[]args) {
		
		// Get input
		Scanner in = new Scanner(System.in);
		System.out.print("Please type a phrase: ");
		String input = in.nextLine();
		
		System.out.println();

		// Find random character in string to remove
		Random rand = new Random();
		char removeChar;
		String letter = input.toLowerCase();
		letter = letter.replace(" ", "");
		// index of random character in string
		int charVal = rand.nextInt(0,letter.length());
		// actual character being removed
		String remove = letter.charAt(charVal)+"";
		// remove character and store it
		String lowerCase = input.toLowerCase();
		lowerCase = lowerCase.replaceAll(remove, "");
		// print results
		System.out.printf("Remove All \'%s\' in \"%s\"",remove, lowerCase);
		in.close();
	}
}
