
public class Main_Test {
	public static void main(String args[]) {

		// Bubblesort
		System.out.println("Bubblesort");
		System.out.println("----------------------------------");
		int arr1[] = { 24, 56, 89, 70, 65, 83, 1, 15, 28, 31 };
		BubbleSort ob1 = new BubbleSort();
		System.out.println("Given array:");
		ob1.printArray(arr1);
		final long timeStart1 = System.nanoTime();
		ob1.bubbleSort(arr1);
		final long timeEnd1 = System.nanoTime();
		System.out.println("Sorted array:");
		ob1.printArray(arr1);
		System.out.println(
				"Benötigte Zeit für Sortierung: " + (timeEnd1 - timeStart1) + " Nanosekunden");
		//System.out.println("Benötigte Zeit für Sortierung: " + (Bubblesort.timeEnd1 - Bubblesort.timeStart1)
			//	+ " Nanosekunden");
		System.out.println();
		System.out.println();

		// InsertionSort
		System.out.println("InsertionSort");
		System.out.println("----------------------------------");
		int arr2[] = { 24, 56, 89, 70, 65, 83, 1, 15, 28, 31 };
		InsertionSort ob2 = new InsertionSort();
		System.out.println("Given array:");
		ob2.printArray(arr2);
		final long timeStart2 = System.nanoTime();
		ob2.insertionSort(arr2);
		final long timeEnd2 = System.nanoTime();
		System.out.println("Sorted array:");
		ob2.printArray(arr2);
		System.out.println(
				"Benötigte Zeit für Sortierung: " + (timeEnd2 - timeStart2) + " Nanosekunden");
		//System.out.println("Benötigte Zeit für Sortierung: " + (InsertionSort.timeEnd2 - InsertionSort.timeStart2)
			//	+ " Nanosekunden");
		System.out.println();
		System.out.println();

		// SelectionSort
		System.out.println("SelectionSort");
		System.out.println("----------------------------------");
		int arr3[] = { 24, 56, 89, 70, 65, 83, 1, 15, 28, 31 };
		SelectionSort ob3 = new SelectionSort();
		System.out.println("Given array:");
		ob3.printArray(arr3);
		final long timeStart3 = System.nanoTime();
		ob3.selectionSort(arr3);
		final long timeEnd3 = System.nanoTime();
		System.out.println("Sorted array:");
		ob3.printArray(arr3);
		System.out.println(
				"Benötigte Zeit für Sortierung: " + (timeEnd3 - timeStart3) + " Nanosekunden");
		//System.out.println("Benötigte Zeit für Sortierung: " + (SelectionSort.timeEnd3 - SelectionSort.timeStart3) + " Nanosekunden");
		System.out.println();
		System.out.println();

		// Quicksort
		System.out.println("QuickSort");
		System.out.println("----------------------------------");

		int arr4[] = { 24, 56, 89, 70, 65, 83, 1, 15, 28, 31 };
		int n1 = arr4.length;
		QuickSort ob4 = new QuickSort();
		System.out.println("Given array:");
		ob4.printArray(arr4);
		final long timeStart4 = System.nanoTime();
		ob4.quickSort(arr4, 0, n1 - 1);
		final long timeEnd4 = System.nanoTime();
		System.out.println("Sorted array:");
		ob4.printArray(arr4);
		System.out.println(
				"Benötigte Zeit für Sortierung: " + (timeEnd4 - timeStart4) + " Nanosekunden");
		//System.out.println("Benötigte Zeit für Sortierung: " + (QuickSort.timeEnd4 - QuickSort.timeStart4) + " Nanosekunden");
		System.out.println();
		System.out.println();

		// Mergesort
		System.out.println("MergeSort");
		System.out.println("----------------------------------");
		int arr5[] = { 24, 56, 89, 70, 65, 83, 1, 15, 28, 31 };
		MergeSort ob5 = new MergeSort();
		System.out.println("Given Array:");
		ob5.printArray(arr5);
		final long timeStart5 = System.nanoTime();
		ob5.mergeSort(arr5, 0, arr5.length - 1);
		final long timeEnd5 = System.nanoTime();
		System.out.println("Sorted array:");
		ob5.printArray(arr5);
		System.out.println(
				"Benötigte Zeit für Sortierung: " + (timeEnd5- timeStart5) + " Nanosekunden");
		//	System.out.println("Benötigte Zeit für Sortierung: " + (MergeSort.timeEnd5 - MergeSort.timeStart5) + " Nanosekunden");
		System.out.println();
		System.out.println();

		// HeapSort
		System.out.println("HeapSort");
		System.out.println("----------------------------------");
		int arr6[] = { 24, 56, 89, 70, 65, 83, 1, 15, 28, 31 };
		HeapSort ob6 = new HeapSort();
		System.out.println("Given array:");
		ob6.printArray(arr6);
		final long timeStart6 = System.nanoTime();
		ob6.heapSort(arr6);
		final long timeEnd6 = System.nanoTime();
		System.out.println("Sorted array:");
		ob4.printArray(arr6);
		System.out.println(
				"Benötigte Zeit für Sortierung: " + (timeEnd6 - timeStart6) + " Nanosekunden");
		//	System.out.println("Benötigte Zeit für Sortierung: " + (HeapSort.timeEnd6 - HeapSort.timeStart6) + " Nanosekunden");
		System.out.println();
		System.out.println();
	}
}
