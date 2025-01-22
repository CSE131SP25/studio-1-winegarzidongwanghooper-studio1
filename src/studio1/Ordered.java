package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = 3;
		System.out.println(x);
		int y = 10;
		System.out.println(y);
		int z = 5;
		System.out.println(z);
		boolean isOrdered =(x>y&&y>z)||(x<y&&y<z);
		System.out.println(isOrdered);
	}
}