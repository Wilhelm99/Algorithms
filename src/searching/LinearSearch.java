package searching;

public class LinearSearch
{
	public static boolean doesContain(int[] array, int key)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == key)	//falls der Wert dem Gesuchten entspricht, wird true zurückgeliefert
				return true;
		}
		return false;
	}
	
	public static int countOccurrences(int[] array, int key)
	{
		int occ = 0;	//Counter für das Vorkommen eines Wertes
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == key)	//falls der Wert dem Gesuchten entspricht, wird der Counter um 1 erhöht
				occ++;
		}
		return occ;	//die Gesamtanzahl wird zurückgeliefert
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
		return result;	//der Index des ersten Treffers wird zurückgeliefert
	}
	
	public static int findLast(int[] array, int key)
	{
		int result = -1;	//default-Wert falls nicht gefunden
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == key)	//result wird immer wieder mit der zuletzt gefundenen Übereinstimmung überschrieben
				result = i;
		}
		return result;	//der Index des letzten Treffers wird zurückgeliefert
		
		//ggf. effizientere Lösung: das Array wird von hinten durchlaufen und beim ersten Treffer abgebrochen
		//dies spart Datenschreiben und Schleifeniterationen
	}
	
	public static int[] findAll(int[] array, int key)
	{
		int[] result = new int[countOccurrences(array, key)];	//ein Array mit der Anzahl der gesuchten Elemente als Länge wird angelegt
		
		int lastOccurrence = 0;	//Intervallabgrenzung
		for(int i = 0; i < result.length; i++)	//äußere Schleife, um durch das Rückgabe-Array zu iterieren
		{
			for(int j = lastOccurrence; j < array.length; j++)	//das Intervall vom letzten Treffer(+1) bis zum Ende des Arrays wird betrachtet
			{
				if(array[j] == key)
				{
					result[i] = j;			//der Index des gesuchten Wertes wird in die passende Stelle in result eingetragen
					lastOccurrence = j+1;	//die Intervallgrenze wird bis zum letzten Treffer+1 erhoben, von wo aus weiter gesucht wird
					break;					//die innere Schleife wird abgebrochen, da result[i] ja bereits gefüllt ist
				}
			}
		}
			
		return result;	//das Array wird zurückgeliefert
	}
}
