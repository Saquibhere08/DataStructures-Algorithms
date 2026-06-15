package arrays;

import java.util.Scanner;

public class Traversal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter Elements (total: " + i + ")= ");
			arr[i] = sc.nextInt();
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(" " + arr[j]);
		}
	}
}
