package com.kn.sort;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array declaration and creation
		System.out.println("Enter the length of an array");
		int[] arr = new int[scan.nextInt()];

		// Array initialization
		System.out.println("Enter contents for an array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		// creating an object for the class InsertionSortOfArray:
		InserionSortOfArray insertionSort = new InserionSortOfArray();
		insertionSort.insertionSortOfArray(arr);

		// Traversing returned array:
		System.out.print("The sorted array contents are :");
		for (int i : insertionSort.insertionSortOfArray(arr)) {
			System.out.print(" " + i);
		}

		// closing the scan:
		scan.close();
	}

}
