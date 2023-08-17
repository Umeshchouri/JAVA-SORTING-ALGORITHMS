package com.kn.sort;

import java.util.Scanner;

public class SelectionSortingOfAnArray {

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

		// creating an object for the class BubbleSort:
		SelectionSorting selectionSorting = new SelectionSorting();
		//selectionSorting.selectionSort(arr);

		// Traversing returned array:
		System.out.print("The sorted array contents are :");
		for (int i:selectionSorting.selectionSort(arr))
		{
			System.out.print(" " + i);
		}

		// closing the scan:
		scan.close();
	}

}
