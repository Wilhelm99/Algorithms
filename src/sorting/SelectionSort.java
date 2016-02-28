package sorting;

import lib.Common;

public class SelectionSort
{	
	public static void sort(int[] array)
	{
		for(int i = array.length-1; i > 0; i--)	//�u�ere Schleife um das gesamte Array zu durchlaufen
		{	
			int currentMax = 0;	//der Index des aktuell gr��ten Wertes
			
			for(int j = 1; j <= i ; j++)	//l�uft bis zum Anfang des sortierten Bereiches
			{
				if(array[j] > array[currentMax])	//sucht im Intervall nach dem gr��ten Wert
					currentMax = j;				
			}
			
			Common.swap(i, currentMax, array);	//tauscht den gr��ten Wert nach i
		}
	}
}
