package assignment4;

public class QuickSort {
	private int[] array;
	private int nElems;

	public QuickSort(int max) {
		array = new int[max];
		nElems = 0;
	}

	public void insert(int value) {
		array[nElems++] = value;
	}

	public void sort() {
		quickSort(0, nElems - 1);
	}

	private void quickSort(int left, int right) {
		if (right - left <= 0)
			return;

		int pivot = array[right];
		int partition = partitionIt(left, right, pivot);
		quickSort(left, partition - 1);
		quickSort(partition + 1, right);
	}

	private int partitionIt(int left, int right, int pivot) {
		int leftPtr = left - 1;
		int rightPtr = right;

		while (true) {
			while (leftPtr < right && array[++leftPtr] < pivot)
				;
			while (rightPtr > left && array[--rightPtr] > pivot)
				;

			if (leftPtr >= rightPtr)
				break;
			swap(leftPtr, rightPtr);
		}

		swap(leftPtr, right);
		return leftPtr;
	}

	private void swap(int dex1, int dex2) {
		int temp = array[dex1];
		array[dex1] = array[dex2];
		array[dex2] = temp;
	}

	public int[] getArray() {
		return array;
	}

	public int getSize() {
		return nElems;
	}
}
