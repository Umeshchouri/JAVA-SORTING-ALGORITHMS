package com.kn.sort;

public class BubbleSort {
	
	//creating a method for the bubble sorting of an array:
	public int[] bubbleSoring(int[] arr)
	{
		//Logic for the bubble sorting:
		int help=0;
		for(int i=0;i<arr.length-1;i++)
		{
			boolean isBoolean=false;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					help=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=help;
					isBoolean=true;
				}
				
			}
			if(isBoolean==false)
			{
				break;
			}
			
		}
		
		//Return the sorted arr:
		return arr;
	}

}
