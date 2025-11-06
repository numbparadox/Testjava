package day1assignments;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter n:");
		int n = scanner.nextInt();
		
		int first = 0;
		int second = 1;
		for(int i=2;i<n;i++) {
			int next = first + second;
			System.out.print(next+" ");
			first = second;
			second = next;
		}
		scanner.close();

	}

}
