package assignment4;

public class HeapSort {

	private int[] array;
	private int currentSize;
	private int maxSize;

	public HeapSort(int max) {
		maxSize = max;
		currentSize = 0;
		array = new int[maxSize];
	}

	public void insert(int value) {
		if (currentSize < maxSize) {
			array[currentSize] = value;
			currentSize++;
		}
	}

	public void sort() {
		for (int i = currentSize / 2 - 1; i >= 0; i--) {
			siftDown(i);
		}

		// Extract elements
		for (int i = currentSize - 1; i > 0; i--) {
			swap(0, i);
			siftDownRange(0, i);
		}
	}

	private void siftDown(int index) {
		siftDownRange(index, currentSize);
	}

	private void siftDownRange(int index, int range) {
		int largest = index;
		int left = 2 * index + 1;
		int right = 2 * index + 2;

		if (left < range && array[left] > array[largest])
			largest = left;

		if (right < range && array[right] > array[largest])
			largest = right;

		if (largest != index) {
			swap(index, largest);
			siftDownRange(largest, range);
		}
	}

	private void swap(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public int[] getArray() {
		return array;
	}

	public int getSize() {
		return currentSize;
	}
}
