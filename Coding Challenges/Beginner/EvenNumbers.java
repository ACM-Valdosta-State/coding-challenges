package Beginner;

import java.util.Scanner;

public class EvenNumbers {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		// Get input from user
		System.out.print("Input: ");
		int n = in.nextInt();
		
		// Loop through and print out the first n even numbers
		for(int i = 0; i < n*2; i += 2)
			System.out.print(i+" ");
		
		System.out.println();
		in.close();
	}

}
