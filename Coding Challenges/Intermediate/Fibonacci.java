package Intermediate;

import java.util.ArrayList;

public class Fibonacci {
	public static void main(String[]args) {
		System.out.println(getFibo(22));
	}
	
	public static int getFibo(int n) {
		ArrayList<Integer> fiboNums = new ArrayList<>();
		fiboNums.add(0);
		fiboNums.add(1);
		
		if(n > 2)
			for(int i = 2; i < n; i++) {
				fiboNums.add(fiboNums.get(i-1) + fiboNums.get(i-2));
			}
		
		return fiboNums.get(n-1);
	}
}
