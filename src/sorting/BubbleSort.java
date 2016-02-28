package sorting;

import lib.Common;

public class BubbleSort
{
	public static void sort(int[] array)
	{
		for(int i = 0; i < array.length; i++)	//�u�ere Schleife f�r jedes Element des Arrays
		{
			//Optimierungen
			boolean modified = false;
			if(isSorted(array))	
				break;
			
			for(int k = 1; k < array.length-i; k++)	//array.length-i Optimierung "Dreiecks-/Stufenform"
			{
				if(array[k] < array[k-1])	//wenn das vorherige Element gr��er ist, wird getauscht
				{
					Common.swap(k, k-1, array);
					modified = true;
				}
			}
			
			if(!modified)	//falls nichts ge�ndert wurde, wird abgebrochen
				break;
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