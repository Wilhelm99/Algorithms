package sorting;

import lib.Common;

/* 	Bitte implementieren Sie den Selectionsort in der Form, dass folgende Eigenschaften erfüllt werden:
*	-Das Array wird aufsteigend sortiert.
*	-Nach der 1. Iteration der äußeren Schleife steht das Element mit dem größten Wert an der letzten Stelle.
*	-Die Suche nach dem jeweils größten verbleibenden Element erfolgt in Richtung aufsteigender Indizes.
*	-Es werden keine überflüssigen Vergleiche, Tauschvorgänge und Zuweisungen durchgeführt.
*	-Es gibt keine inhaltsspezifischen Optimierungen: Die Anzahl der Iterationen der Schleifen und der Tauschvorgänge, hängt also von der Anzahl der Elemente der Arrays ab, nicht jedoch vom Inhalt.
*	-Zur Duchführung des Dreieckstausches wird die Methode swap() verwendet.
*/

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
