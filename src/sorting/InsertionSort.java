package sorting;

public class InsertionSort
{
	public static void sort(int[] array)
	{
		int i, j, temp;
		for(i = 1; i < array.length; i++)	//�u�ere Schleife f�r jedes Element des Arrays
		{
			temp = array[i];	//speichert den sp�ter einzuf�genden Wert
			for(j = i-1; j >= 0 && array[j] > temp; j--)	//verschiebt die Elemente so lange nach vorne, bis es kein Gr��eres mehr gibt
			{
				array[j+1] = array[j]; 	//schiebt die Elemente auf
			}
			array[j+1] = temp;	//setzt den Wert an der richtigen Stelle ein
		}
	}
}
