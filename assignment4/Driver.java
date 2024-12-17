/* Omar Habeel
 * COSC 311 assignment 4
 * 11/30/2024
 */
package assignment4;

import java.io.*;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		int max = 10000;
		int[] asc = new int[max];
		int[] des = new int[max];
		int[] rand = new int[max];

		try {
			Scanner ascending = new Scanner(new File("dataAscend.txt"));
			int i = 0;
			while (ascending.hasNext() && i < asc.length) {
				asc[i++] = ascending.nextInt();
			}
			ascending.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Scanner descending = new Scanner(new File("dataDescend.txt"));
			int i = 0;
			while (descending.hasNext() && i < des.length) {
				des[i++] = descending.nextInt();
			}
			descending.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Scanner random = new Scanner(new File("dataRandom.txt"));
			int i = 0;
			while (random.hasNext() && i < rand.length) {
				rand[i++] = random.nextInt();
			}
			random.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

//here i read in the input files into 3 objects, one for ascending, descending, and random

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the name for the quicksort output files: ");
		String quickSortName = scan.nextLine();

		QuickSort quickSortAsc = new QuickSort(max);
		QuickSort quickSortDes = new QuickSort(max);
		QuickSort quickSortRand = new QuickSort(max);

//i create 3 quickSort objects to later run the quicksort algorithm on
		for (int i = 0; i < asc.length; i++) {
			quickSortAsc.insert(asc[i]);
		}
		for (int i = 0; i < des.length; i++) {
			quickSortDes.insert(des[i]);
		}
		for (int i = 0; i < rand.length; i++) {
			quickSortRand.insert(rand[i]);
		}
//here i insert the values from the array input files into the 3 quicksort arrays, then run
//quick sort on each of them timing the algorithms as they go. 
		final long quickSortAscStart = System.currentTimeMillis();
		quickSortAsc.sort();
		final long quickSortAscEnd = System.currentTimeMillis();

		final long quickSortDesStart = System.currentTimeMillis();
		quickSortDes.sort();
		final long quickSortDesEnd = System.currentTimeMillis();

		final long quickSortRandStart = System.currentTimeMillis();
		quickSortRand.sort();
		final long quickSortRandEnd = System.currentTimeMillis();

		try (PrintWriter out = new PrintWriter(quickSortName + "Ascending.txt")) {
			for (int i = 0; i < max; i++) {
				out.println(quickSortAsc.getArray()[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try (PrintWriter out = new PrintWriter(quickSortName + "Descending.txt")) {
			for (int i = 0; i < max; i++) {
				out.println(quickSortDes.getArray()[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try (PrintWriter out = new PrintWriter(quickSortName + "Random.txt")) {
			for (int i = 0; i < max; i++) {
				out.println(quickSortRand.getArray()[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.print("Enter the name for the mergeSort output files: ");
		String mergeSortName = scan.nextLine();

		MergeSort MergeSortAsc = new MergeSort(max);
		MergeSort MergeSortDes = new MergeSort(max);
		MergeSort MergeSortRand = new MergeSort(max);

		for (int i = 0; i < asc.length; i++) {
			MergeSortAsc.insert(asc[i]);
		}
		for (int i = 0; i < des.length; i++) {
			MergeSortDes.insert(des[i]);
		}
		for (int i = 0; i < rand.length; i++) {
			MergeSortRand.insert(rand[i]);
		}

		final long mergeSortAscStart = System.currentTimeMillis();
		MergeSortAsc.sort();
		final long mergeSortAscEnd = System.currentTimeMillis();

		final long mergeSortDesStart = System.currentTimeMillis();
		MergeSortDes.sort();
		final long mergeSortDesEnd = System.currentTimeMillis();

		final long mergeSortRandStart = System.currentTimeMillis();
		MergeSortRand.sort();
		final long mergeSortRandEnd = System.currentTimeMillis();

		try (PrintWriter out = new PrintWriter(mergeSortName + "Ascending.txt")) {
			for (int i = 0; i < max; i++) {
				out.println(MergeSortAsc.getArray()[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try (PrintWriter out = new PrintWriter(mergeSortName + "Descending.txt")) {
			for (int i = 0; i < max; i++) {
				out.println(MergeSortDes.getArray()[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try (PrintWriter out = new PrintWriter(mergeSortName + "Random.txt")) {
			for (int i = 0; i < max; i++) {
				out.println(MergeSortRand.getArray()[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.print("Enter the name for the heapSort output files: ");
		String heapSortName = scan.nextLine();

		HeapSort heapSortAsc = new HeapSort(max);
		HeapSort heapSortDes = new HeapSort(max);
		HeapSort heapSortRand = new HeapSort(max);

		for (int i = 0; i < asc.length; i++) {
			heapSortAsc.insert(asc[i]);
		}
		for (int i = 0; i < des.length; i++) {
			heapSortDes.insert(des[i]);
		}
		for (int i = 0; i < rand.length; i++) {
			heapSortRand.insert(rand[i]);
		}

		final long heapSortAscStart = System.currentTimeMillis();
		heapSortAsc.sort();
		final long heapSortAscEnd = System.currentTimeMillis();

		final long heapSortDesStart = System.currentTimeMillis();
		heapSortDes.sort();
		final long heapSortDesEnd = System.currentTimeMillis();

		final long heapSortRandStart = System.currentTimeMillis();
		heapSortRand.sort();
		final long heapSortRandEnd = System.currentTimeMillis();

		try (PrintWriter out = new PrintWriter(heapSortName + "Ascending.txt")) {
			for (int i = 0; i < max; i++) {
				out.println(heapSortAsc.getArray()[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try (PrintWriter out = new PrintWriter(heapSortName + "Descending.txt")) {
			for (int i = 0; i < max; i++) {
				out.println(heapSortDes.getArray()[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try (PrintWriter out = new PrintWriter(heapSortName + "Random.txt")) {
			for (int i = 0; i < max; i++) {
				out.println(heapSortRand.getArray()[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("heapSortAsc: " + (heapSortAscEnd - heapSortAscStart));
		System.out.println("heapSortDes: " + (heapSortDesEnd - heapSortDesStart));
		System.out.println("heapSortRand: " + (heapSortRandEnd - heapSortRandStart));
		System.out.println("mergeSortAsc: " + (mergeSortAscEnd - mergeSortAscStart));
		System.out.println("mergeSortDes: " + (mergeSortDesEnd - mergeSortDesStart));
		System.out.println("mergeSortRand: " + (mergeSortRandEnd - mergeSortRandStart));
		System.out.println("quickSortAsc: " + (quickSortAscEnd - quickSortAscStart));
		System.out.println("quickSortdes: " + (quickSortDesEnd - quickSortDesStart));
		System.out.println("quickSortRand: " + (quickSortRandEnd - quickSortRandStart));

//I perform the same steps i did on the quicksort on the other 2 sort algorithms. I ask for 3 file names
//and create three files of that name for each sorting algorithm.
	}
}
