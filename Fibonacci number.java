package cetvrtipaket;

import java.util.Scanner;

public class Vezbanje {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1 = 1;
		int a2 = 1;
		int temp;
		System.out.print("Unesite koji Fibonacijev broj zelite: ");
		int x = 2, n = sc.nextInt();
		do {
			temp = a1;
			a1 = a2;
			a2 = temp + a2;
			x++;
		} while (x < n);
		System.out.println(n + ". Fibonacijev broj je: " + a2);
	}

}
