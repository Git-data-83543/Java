//Q1. Write a generic sort method for implementing selection sort algorithm
//with given comparator
//Object as parameter. Below is reference code for selection sort 
//do the respective changes to make it
//generic using comparator
//static void selectionSort(Integer [] arr) {
//for(int i=0; i<arr.length-1; i++)
//for(int j=i+1; j<arr.length; j++)
//if(arr[i] > arr[j]) {
//Integer temp = arr[i];
//arr[i] = arr[j];
//arr[j] = temp;
//}
//}
package assignment8Q2;

import java.util.Comparator;

public class selection {

	public static void main(String[] args) {

		Integer arr[] = { 1, 8, 6, 9, 4, 5 };

		System.out.println("Elements Before Sorting:");
		for (Integer elements : arr) {
			System.out.println(elements);
		}

		class sort{
			static <T> int selectionSort(T[] arr, Comparator c) {
				for (int i = 0; i < arr.length - 1; i++) {
					for (int j = i + 1; j < arr.length; j++) {
						if (c.compare(arr[i], arr[j]) > 0) {
							T temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}
			}
		}
		return 0;

	}
}

sort.<Integer>selectionSort(arr,Comparator.naturalOrder());
System.out.println("Elements After Sorting:");
for (Integer elements : arr) {
	System.out.println(elements);
}
}
}
