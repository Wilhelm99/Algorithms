package sorting;

import lib.Common;

public class QuickSort
{
	private static int partition(int left, int right, int[] array)
	{
		int loIndex = left+1;	//vorderer Anfang+1, da das erste Element als Pivotelement genommen wird und nicht betrachtet wird!
		int hiIndex = right;	//Ende
		int pivot = left;		//erstes Element als Pivot
		
		while(loIndex <= hiIndex)	//solange der untere Wert den Oberen nicht �berschreitet
		{
			while(loIndex <= hiIndex && array[loIndex] < array[pivot])	//sucht so lange weiter, bis ein kleinerer Wert gefunden wurde
				loIndex++;
			while(loIndex <= hiIndex && array[hiIndex] > array[pivot])	//sucht so lange weiter, bis ein gr��erer Wert gefunden wurde
				hiIndex--;
			
			if(loIndex <= hiIndex)	//falls der obere Wert den Unteren in der zweiten Suche unterschritten hat, wird nicht getauscht
			{
				Common.swap(loIndex, hiIndex, array);
				loIndex++;	//Wird erh�ht bzw. verringert, da die jeweiligen Indizes bereits betrachtet wurden
				hiIndex--;
			}
		}
		Common.swap(hiIndex, pivot, array);
		
		return hiIndex;
	}
	
	private static void sort(int start, int end, int[] array)
	{
		if(end <= start)	//Rekursionsende, falls end start unterschreitet
			return;
		
		int pivot = partition(start, end, array);	//Anfangswert f�r Pivot
		sort(start, pivot-1, array);				//rekursive Implementierung, erst wird der Teil vor dem Pivotelement betrachtet
		sort(pivot+1, end, array);					//dann der Teil hinter dem Pivotelement
	}
	
	public static void sort(int[] array)	//�berladene public-Methode zum Aufruf
	{
		sort(0, array.length-1, array);
	}
}
