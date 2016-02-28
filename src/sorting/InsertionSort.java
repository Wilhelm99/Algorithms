package sorting;

import lib.Common;

public class InsertionSort
{
	public static void sort(int[] array)
	{
		for(int i = 0; i < array.length; i++)	//äußere Schleife für jedes Element des Arrays
		{
			for(int j = i; j > 0 && array[j-1] > array[j]; j--)	//tauscht das Element so lange nach vorne, bis es kein größeres mehr gibt
			{
				Common.swap(j, j-1, array);
			}
		}
	}
}
