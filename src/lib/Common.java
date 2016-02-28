package lib;

import java.util.*;

public class Common
{
	public static void printArray(int[] array)
	{
		for(int i = 0; i < array.length-1; i++)
			System.out.print(array[i]+",");
		System.out.println(array[array.length-1]);
	}
	
	public static void swap(int index1, int index2, int[] array)
	{
		int buffer = array[index1];
		array[index1] = array[index2];
		array[index2] = buffer;
	}
	
	public static int[] generateRandomArray(int size, int maxValue)
	{
		int[] array = new int[size];
		Random rn = new Random();
		for(int i = 0; i < array.length; i++)
		{
			array[i]=rn.nextInt(maxValue);
		}
			
		return array;
	}
}
