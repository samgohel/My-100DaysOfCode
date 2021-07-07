public class UsingQuickSortProcess {

	public static void moveElement(int[] input, int size) {
		int j = 0, temp;

		for (int i = 0; i < size; i++) {
			if (input[i] < 0) {
				if (i != j) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
				j++;
			}
		}
	}

	public static void printArray(int[] input) {
		for (int ele : input) {
			System.out.println(ele + " ");
		}
	}

	public static void main(String[] args) {
		int[] input = { -3, -9, -8, -6, 7, -3, -2 };
		int size = input.length;

		moveElement(input, size);
		printArray(input);
	}

}