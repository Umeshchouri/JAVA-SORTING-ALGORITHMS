package com.kn.sort;

public class SelectionSorting {

	public int[] selectionSort(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			int min=arr[i];
			int index=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(min>arr[j])
				{
					min=arr[j];
					index=j;		
				}
			}
			
			int help=arr[i];
			arr[i]=min;
			arr[index]=help;
		}
		return arr;
	}

}
