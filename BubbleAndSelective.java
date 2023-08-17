package com.kn.sort;

public class BubbleAndSelective {
	// Method for the bubble sorting:
	public int[] bubbleSorting(int[] arr) {
		int help;
		for (int i = 0; i < arr.length - 1; i++) {
			boolean isBoolean = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					help = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = help;
					isBoolean = true;
				}
			}
			if (isBoolean == false) {
				break;
			}
		}
		return arr;

	}

	// Method for the selection sort:
	public int[] selectionSorting(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (min > arr[j]) {
					min = arr[j];
					index = j;
				}
				int help;
				help = arr[i];
				arr[i] = min;
				arr[index] = help;
			}
		}
		return arr;
	}

}
