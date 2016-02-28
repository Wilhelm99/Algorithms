package sorting;

import lib.Common;

public class SelectionSort
{	
	public static void sort(int[] array)
	{
		for(int i = array.length-1; i > 0; i--)	//äußere Schleife um das gesamte Array zu durchlaufen
		{	
			int currentMax = 0;	//der Index des aktuell größten Wertes
			
			for(int j = 1; j <= i ; j++)	//läuft bis zum Anfang des sortierten Bereiches
			{
				if(array[j] > array[currentMax])	//sucht im Intervall nach dem größten Wert
					currentMax = j;				
			}
			
			Common.swap(i, currentMax, array);	//tauscht den größten Wert nach i
		}
	}
}
