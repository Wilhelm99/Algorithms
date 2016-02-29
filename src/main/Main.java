package main;

import lib.Common;
import searching.*;
import sorting.*;

@SuppressWarnings("unused")
public class Main
{
	public static void main(String[] args)
	{
		//Test-Array für Suche
		int[] sArray = {2,6,12,17,25,27,35,36,39,42,42,53,57,64,76,88,91,92,95,101};
		Common.printArray(sArray);
		
		System.out.println("Binary Search test (1st iterative, 2nd recursive):");
		//Hier testen
		System.out.println(BinarySearch.search(sArray, 42));
		System.out.println(BinarySearchRecursive.search(sArray, 88));
		System.out.println("Linear Search test (doesContain, countOccurrences, findFirst, findLast, findAll):");
		System.out.println(LinearSearch.doesContain(sArray, 101));
		System.out.println(LinearSearch.countOccurrences(sArray, 42));
		System.out.println(LinearSearch.findFirst(sArray, 42));
		System.out.println(LinearSearch.findLast(sArray, 42));
		Common.printArray(LinearSearch.findAll(sArray, 42));
		
		//zufällig generiertes Test-Array zum sortieren
		int[] sortingArray = Common.generateRandomArray(20, 101);
		
		System.out.println("Sorting test:");
		Common.printArray(sortingArray);
		//Hier testen (immer nur eine Methode auf einmal!)
		
		//BubbleSort.sort(sortingArray);
		//InsertionSort.sort(sortingArray);
		//SelectionSort.sort(sortingArray);
		//QuickSort.sort(sortingArray);
		
		Common.printArray(sortingArray);
	}
}
