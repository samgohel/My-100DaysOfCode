public class UsingTwoPointer {

	public static void moveElement(int[] input, int left, int right) {
		while (left <= right) {
			if (input[left] < 0 && input[right] < 0)
				left++;

			else if (input[left] > 0 && input[right] < 0) {
				int temp = input[left];
				input[left] = input[right];
				input[right] = temp;
				left++;
				right--;
			}

			else if (input[left] > 0 && input[right] > 0) {
				right--;
			} else {
				left++;
				right--;
			}
		}
	}

	public static void printArray(int[] input) {
		for (int ele : input)
			System.out.println(ele + " ");
	}

	public static void main(String[] args) {
		int[] input = { -3, -9, -8, -6, 7, -3, -2 };
		int size = input.length;

		moveElement(input, 0, size - 1);
		printArray(input);
	}

}