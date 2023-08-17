package com.kn.sort;

import java.util.Scanner;

public class BubbleAndISelectiveSortingOfArray {

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
		BubbleAndSelective bubbleSort = new BubbleAndSelective();
		BubbleAndSelective selectionSort=new BubbleAndSelective();
		
		bubbleSort.bubbleSorting(arr);
		selectionSort.selectionSorting(arr);

		 //Traversing returned array:
		System.out.print("The sorted array contents using bubble sort are :");
		for (int i:bubbleSort.bubbleSorting(arr))
		{
			System.out.print(" " + i);
		}
		System.out.println();
		System.out.print("The sorted array contents using selection sort are :");
		for (int i:selectionSort.selectionSorting(arr))
		{
			System.out.print(" " + i);
		}

		// closing the scan:
		scan.close();
	}

}
