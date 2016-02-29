package main;

import lib.Common;
import searching.*;
import sorting.*;

@SuppressWarnings("unused")
public class Main
{
	public static void main(String[] args)
	{
		//Test-Array für Binary Search
		int[] bsArray = {2,6,12,17,25,27,34,35,36,39,42,53,57,64,76,88,91,92,95,101};
		Common.printArray(bsArray);
		
		System.out.println("Binary Search test (1st iterative, 2nd recursive):");
		//Hier testen
		System.out.println(BinarySearch.search(bsArray, 42));
		System.out.println(BinarySearchRecursive.search(bsArray, 88));
		
		//zufällig generiertes Test-Array zum sortieren
		int[] sortingArray = Common.generateRandomArray(20, 101);
		Common.printArray(sortingArray);
		
		System.out.println("Sorting test:");
		//Hier testen (immer nur eine Methode auf einmal!)
		
		//BubbleSort.sort(sortingArray);
		//InsertionSort.sort(sortingArray);
		//SelectionSort.sort(sortingArray);
		//QuickSort.sort(sortingArray);
		
		Common.printArray(sortingArray);
	}
}
