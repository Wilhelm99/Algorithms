package searching;

public class BinarySearch
{
	public static int search(int[] array, int key)
	{
		//Anfangswerte f�r start und end
		int start = 0;
		int end = array.length-1;
		int mid;
		
		while(start <= end)	//sucht solange start nicht end �berschreitet
		{
			mid = (start+end)/2;		//die Mitte wird festgelegt
			if(array[mid] == key)		//Fall: gefunden, Index wird zur�ckgeliefert
				return mid;
			else if(key > array[mid])	//Fall: Wert liegt in der gr��eren H�lfte, start wird verschoben
				start = mid + 1;
			else if(key < array[mid])	//Fall: Wert liegt in der kleineren H�lfte, end wird verschoben
				end = mid - 1;
		}
		
		return -1;	//Fehler-R�ckgabewert, nicht gefunden
	}
}
