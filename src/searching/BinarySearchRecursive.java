package searching;

public class BinarySearchRecursive
{
	private static int search(int[] array, int key, int start, int end)
	{
		int mid = (start+end)/2;		//Mitte wird festgelegt
		
		if(start > end);				//falls start größer end wird, springt das Programm bereits hier aus den if-checks und direkt zu return -1
		
		else if(array[mid] == key)		//Fall: gefunden, Index wird zurückgeliefert
			return mid;
		
		else if(key < array[mid])		//Fall: Wert liegt in der kleineren Hälfte, start wird verschoben und die Methode mit dem neuen Wert aufgerufen
			return search(array, key, start, mid-1);
		
		else if(key > array[mid])		//Fall: Wert liegt in der größeren Hälfte, end wird verschoben und die Methode mit dem neuen Wert aufgerufen
			return search(array, key, mid+1, end);
		
		return -1;						//Fehler-Rückgabewert, nicht gefunden
	}
	
	public static int search(int[] array, int key)	//überladene public-Methode zum Aufruf
	{
		return search(array, key, 0, array.length-1);
	}
}
