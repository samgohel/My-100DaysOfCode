public class WithIndexOfMaxSum {

	public static void main(String[] args) {
		int[] input = { 10, 8, 5, -2, 47, -10, 5 };
		maxSumSubArray(input);
	}

	static void maxSumSubArray(int[] input) {
		int size = input.length;
		int maxSum = Integer.MIN_VALUE;
		int currentMax = 0;
		int startIndex = 0;
		int endIndex = 0;
		int temp = 0;

		for (int i = 0; i < size; i++) {
			currentMax += input[i];

			if (maxSum < currentMax) {
				maxSum = currentMax;
				startIndex = temp;
				endIndex = i;
			}
			if (currentMax < 0) {
				currentMax = 0;
				temp = i + 1;
			}
		}
		System.out.println("Max. Cont. Sum is: " + maxSum);
		System.out.println("Start Index: " + startIndex);
		System.out.println("End Index: " + endIndex);
	}

}
