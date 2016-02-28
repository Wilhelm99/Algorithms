package sorting;

import lib.Common;

public class SelectionSort
{	
	//Methode zum suchen des größten Wertes
	private static int search(int[] array, int end)	//end = Ende des zu durchsuchenden Bereiches, alles davor bzw. danach ist bereits sortiert
	{
		int current = end;	//der Index des in der jeweiligen Iteration (aktuellstes) größten Elementes
		
		for(int i = end; i < array.length ; i++)	//sucht von hinten nach vorne
		{
			if(array[i] > array[current])
				current = i;
		}
		
		return current;	//Rückgabe: Index des größten Elementes
	}
	
	public static void sort(int[] array)
	{
		for(int i = 0; i < array.length; i++)	//geht von vorne nach hinten
		{
			Common.swap(i, search(array, i), array);	//das jeweils größte Element wird nach vorne getauscht
		}
	}
}
