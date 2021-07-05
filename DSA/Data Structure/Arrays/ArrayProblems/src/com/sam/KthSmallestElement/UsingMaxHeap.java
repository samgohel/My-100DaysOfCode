public class UsingMaxHeap {

	class MaxHeap {
		int[] harr;
		int capacity;
		int heapSize;

		int parent(int i) {
			return (i - 1) / 2;
		}

		int left(int i) {
			return (2 * i + 1);
		}

		int right(int i) {
			return (2 * i + 2);
		}

		int getMax() {
			return harr[0];
		}

		void replaceMax(int x) {
			this.harr[0] = x;
			maxHeapify(0);
		}

		MaxHeap(int[] a, int size) {
			heapSize = size;
			harr = a;
			int i = (heapSize - 1) / 2;
			while (i >= 0) {
				maxHeapify(i);
				i--;
			}
		}

		int extractMax() {
			if (heapSize == 0)
				return Integer.MAX_VALUE;

			int root = harr[0];

			if (heapSize > 1) {
				harr[0] = harr[heapSize - 1];
				maxHeapify(0);
			}
			heapSize--;
			return root;

		}

		void maxHeapify(int i) {
			int l = left(i);
			int r = right(i);
			int largest = i;

			if (l < heapSize && harr[l] > harr[i])
				largest = l;

			if (r < heapSize && harr[r] > harr[largest])
				largest = r;

			if (largest != i) {
				int t = harr[i];
				harr[i] = harr[largest];
				harr[largest] = t;
				maxHeapify(largest);
			}
		}
	}

	int kthSmallest(int[] input, int size, int k) {
		MaxHeap mh = new MaxHeap(input, k);

		for (int i = k; i < size; i++)
			if (input[i] < mh.getMax())
				mh.replaceMax(input[i]);
		return mh.getMax();
	}

	public static void main(String[] args) {
		int[] input = { 1, 2, 6, 8, 9, 4, 2, 3 };
		int size = input.length;
		int k = 2;
		UsingMaxHeap usingMaxHeap = new UsingMaxHeap();
		System.out.println("K'th smallest element is " + usingMaxHeap.kthSmallest(input, size, k));
	}

}