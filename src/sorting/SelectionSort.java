package sorting;

import lib.Common;

/* 	Bitte implementieren Sie den Selectionsort in der Form, dass folgende Eigenschaften erf�llt werden:
*	-Das Array wird aufsteigend sortiert.
*	-Nach der 1. Iteration der �u�eren Schleife steht das Element mit dem gr��ten Wert an der letzten Stelle.
*	-Die Suche nach dem jeweils gr��ten verbleibenden Element erfolgt in Richtung aufsteigender Indizes.
*	-Es werden keine �berfl�ssigen Vergleiche, Tauschvorg�nge und Zuweisungen durchgef�hrt.
*	-Es gibt keine inhaltsspezifischen Optimierungen: Die Anzahl der Iterationen der Schleifen und der Tauschvorg�nge, h�ngt also von der Anzahl der Elemente der Arrays ab, nicht jedoch vom Inhalt.
*	-Zur Duchf�hrung des Dreieckstausches wird die Methode swap() verwendet.
*/

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
