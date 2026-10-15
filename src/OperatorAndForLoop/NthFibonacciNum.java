package OperatorAndForLoop;

import java.util.Scanner;
public class NthFibonacciNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = 0;
		int b = 1;
		int c;
		while(n>0) {
			c = a + b;
			n--;
			a = b;
			b = c;
		}
		System.out.println(a);

	}

}

