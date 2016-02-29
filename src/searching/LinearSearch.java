package searching;

public class LinearSearch
{
	public static boolean doesContain(int[] array, int key)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == key)	//falls der Wert dem Gesuchten entspricht, wird true zur�ckgeliefert
				return true;
		}
		return false;
	}
	
	public static int countOccurrences(int[] array, int key)
	{
		int occ = 0;	//Counter f�r das Vorkommen eines Wertes
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == key)	//falls der Wert dem Gesuchten entspricht, wird der Counter um 1 erh�ht
				occ++;
		}
		return occ;	//die Gesamtanzahl wird zur�ckgeliefert
	}
	
	public static int findFirst(int[] array, int key)
	{
		int result = -1;	//default-Wert falls nicht gefunden
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == key)	//beim ersten Treffer wird die Schleife abgebrochen
			{
				result = i;
				break;
			}
		}
		return result;	//der Index des ersten Treffers wird zur�ckgeliefert
	}
	
	public static int findLast(int[] array, int key)
	{
		int result = -1;	//default-Wert falls nicht gefunden
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == key)	//result wird immer wieder mit der zuletzt gefundenen �bereinstimmung �berschrieben
				result = i;
		}
		return result;	//der Index des letzten Treffers wird zur�ckgeliefert
		
		//ggf. effizientere L�sung: das Array wird von hinten durchlaufen und beim ersten Treffer abgebrochen
		//dies spart Datenschreiben und Schleifeniterationen
	}
	
	public static int[] findAll(int[] array, int key)
	{
		int[] result = new int[countOccurrences(array, key)];	//ein Array mit der Anzahl der gesuchten Elemente als L�nge wird angelegt
		
		int lastOccurrence = 0;	//Intervallabgrenzung
		for(int i = 0; i < result.length; i++)	//�u�ere Schleife, um durch das R�ckgabe-Array zu iterieren
		{
			for(int j = lastOccurrence; j < array.length; j++)	//das Intervall vom letzten Treffer(+1) bis zum Ende des Arrays wird betrachtet
			{
				if(array[j] == key)
				{
					result[i] = j;			//der Index des gesuchten Wertes wird in die passende Stelle in result eingetragen
					lastOccurrence = j+1;	//die Intervallgrenze wird bis zum letzten Treffer+1 erhoben, von wo aus weiter gesucht wird
					break;					//die innere Schleife wird abgebrochen, da result[i] ja bereits gef�llt ist
				}
			}
		}
			
		return result;	//das Array wird zur�ckgeliefert
	}
}
