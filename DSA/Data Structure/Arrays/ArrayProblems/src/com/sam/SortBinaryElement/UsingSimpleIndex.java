public class UsingSimpleIndex {

	static void sortElement(int[] input, int size) {
		int low = 0;
		int high = size - 1;
		int mid = 0;
		int temp = 0;

		while (mid <= high) {
			switch (input[mid]) {
			case 0: {
				temp = input[low];
				input[low] = input[mid];
				input[mid] = temp;
				low++;
				mid++;
				break;
			}
			case 1:
				mid++;
				break;
			case 2: {
				temp = input[mid];
				input[mid] = input[high];
				input[high] = temp;
				high--;
				break;
			}

			}
		}
	}

	public static void printArray(int[] input, int size) {
		for (int ele : input) {
			System.out.println(ele + " ");
		}

	}

	public static void main(String[] args) {
		int[] input = { 0, 1, 2, 2, 1, 0, 1, 2, 1, 2 };
		int size = input.length;

		sortElement(input, size);
		printArray(input, size);
	}
}