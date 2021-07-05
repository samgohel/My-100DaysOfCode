public class UsingMinHeap {

	class MinHeap {
		int[] harr;
		int capacity;
		int heapSize;

		int parent(int i) {
			return (i - 1) / 2;
		}

		int left(int i) {
			return ((2 * i) + 1);
		}

		int right(int i) {
			return ((2 * i) + 2);
		}

		int getMin() {
			return harr[0];
		}

		void replaceMax(int x) {
			this.harr[0] = x;
			minHeapify(0);
		}

		MinHeap(int[] a, int size) {
			heapSize = size;
			harr = a;
			int i = (heapSize - 1) / 2;
			while (i >= 0) {
				minHeapify(i);
				i--;
			}
		}

		int extractMin() {
			if (heapSize == 0)
				return Integer.MAX_VALUE;

			int root = harr[0];

			if (heapSize > 1) {
				harr[0] = harr[heapSize - 1];
				minHeapify(0);
			}
			heapSize--;
			return root;
		}

		void minHeapify(int i) {
			int l = left(i);
			int r = right(i);
			int smallest = i;
			if (l < heapSize && harr[l] < harr[i])
				smallest = l;
			if (r < heapSize && harr[r] < harr[smallest])
				smallest = l;
			if (smallest != i) {
				int t = harr[i];
				harr[i] = harr[smallest];
				harr[smallest] = t;
				minHeapify(smallest);
			}
		}

	};

	int kthSmallElemet(int[] arr, int size, int k) {
		MinHeap mh = new MinHeap(arr, size);
		for (int i = 0; i < k - 1; i++) {
			mh.extractMin();
		}
		return mh.getMin();
	}

	public static void main(String[] args) {
		int[] inputArray = { 1, 2, 6, 8, 9, 4, 2, 3 };
		int size = inputArray.length;
		int k = 2;
		UsingMinHeap usingMeanHeap = new UsingMinHeap();
		System.out.print("K'th smallest element is " + usingMeanHeap.kthSmallElemet(inputArray, size, k));

	}
}