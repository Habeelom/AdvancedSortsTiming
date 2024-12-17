package assignment4;

public class MergeSort {

	private int[] array;
	private int nElems;

	public MergeSort(int max) {
		array = new int[max];
		nElems = 0;
	}

	public void insert(int value) {
		array[nElems++] = value;
	}

	public void sort() {
		int[] workSpace = new int[nElems];
		mergeSortRecursive(workSpace, 0, nElems - 1);
	}

	private void mergeSortRecursive(int[] workSpace, int lowerBound, int upperBound) {
		if (lowerBound == upperBound)
			return;

		int mid = (lowerBound + upperBound) / 2;
		mergeSortRecursive(workSpace, lowerBound, mid);
		mergeSortRecursive(workSpace, mid + 1, upperBound);
		merge(workSpace, lowerBound, mid + 1, upperBound);
	}

	private void merge(int[] workSpace, int lowPtr, int highPtr, int upperBound) {
		int j = 0;
		int lowerBound = lowPtr;
		int mid = highPtr - 1;
		int n = upperBound - lowerBound + 1;

		while (lowPtr <= mid && highPtr <= upperBound) {
			if (array[lowPtr] < array[highPtr])
				workSpace[j++] = array[lowPtr++];
			else
				workSpace[j++] = array[highPtr++];
		}

		while (lowPtr <= mid)
			workSpace[j++] = array[lowPtr++];

		while (highPtr <= upperBound)
			workSpace[j++] = array[highPtr++];

		for (j = 0; j < n; j++)
			array[lowerBound + j] = workSpace[j];
	}

	public int[] getArray() {
		return array;
	}

	public int getSize() {
		return nElems;
	}
}
