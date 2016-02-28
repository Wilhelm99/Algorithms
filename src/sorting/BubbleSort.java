package sorting;

import lib.Common;

public class BubbleSort
{
	public static void sort(int[] array)
	{
		for(int i = 0; i < array.length; i++)	//äußere Schleife für jedes Element des Arrays
		{
			if(isSorted(array))	//Optimierung
				break;
			
			for(int k = 1; k < array.length; k++)
			{
				if(array[k] < array[k-1])	//wenn das vorherige Element größer ist, wird getauscht
					Common.swap(k, k-1, array);
			}
		}
	}
	
	private static boolean isSorted(int[] array)	//Optimierung
	{
		for(int i = 1; i < array.length; i++)
		{
			if(array[i] < array[i-1])
				return false;
		}
		
		return true;
	}
}