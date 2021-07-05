public class UsingQuickSelect {

	public static int partition(Integer[] input, int l, int r) {
		int x = input[r], i = l;
		for (int j = l; j <= r - 1; j++) {
			if (input[j] <= x) {
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				i++;
			}
		}

		int temp = input[i];
		input[i] = input[r];
		input[r] = temp;
		return i;
	}

	public static int kthSmallest(Integer[] input, int l, int r, int k) {
		if (k > 0 && k <= r - l + 1) {
			int pos = partition(input, l, r);
			if (pos - l == k - 1)
				return input[pos];

			if (pos - l > k - 1)
				return kthSmallest(input, l, pos - 1, k);
			
			return kthSmallest(input, pos + 1, r, k - pos + l - 1);
		}
		return Integer.MAX_VALUE;
	}

	public static void main(String[] args) {
		Integer[] input = { 1, 2, 6, 8, 9, 4, 2, 3 };
		int size = input.length;
		int k = 2;

		System.out.print("K'th smallest element is " + kthSmallest(input, 0, size - 1, k));
	}
}
