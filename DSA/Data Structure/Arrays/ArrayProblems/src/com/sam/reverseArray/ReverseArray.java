public class ReverseArray{
  public static void main(String[] args) {
		int[] inputArray = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int size = inputArray.length;

		System.out.println("Reverse Using New Array ");
		System.out.println(Arrays.toString(revUsingNewArray(inputArray, size)));

		System.out.println("Reverse Without New Array ");
		System.out.println(Arrays.toString(revWithoutNewArray(inputArray, size)));

		System.out.println("Reverse Using Collection ");
		System.out.println(Arrays.toString(revUsingCollection(inputArray)));

		System.out.println("Reverse Using Reverse Loop");
		for (int i = size - 1; i >= 0; i--) {
			System.out.print(inputArray[i] + " ");
		}

	}

	/**
	 * Reverse Array using new array.
	 *
	 * @param input the input array
	 * @param size  the size of array
	 */
	public static int[] revUsingNewArray(int[] input, int size) {
		int[] newArray = new int[size];
		int newArrayIndex = size;

		for (int i = 0; i < size; i++) {
			newArray[newArrayIndex - 1] = input[i];
			newArrayIndex = newArrayIndex - 1;
			Arrays.toString(newArray);
		}

		return newArray;

	}

	/**
	 * Reverse Array without new array.
	 *
	 * @param input the input array
	 * @param size  the size of array
	 * @return
	 */
	public static int[] revWithoutNewArray(int[] input, int size) {
		for (int i = 0; i < size / 2; i++) {
			int temp = input[i];
			input[i] = input[size - i - 1];
			input[size - i - 1] = temp;
		}
		return input;
	}

	/**
	 * Reverse using Collection.
	 *
	 * @param input the input array
	 */
	public static int[] revUsingCollection(int[] input) {
		List<int[]> listFromArray = Arrays.asList(input);
		Collections.reverse(listFromArray);
		return input;
	}
}