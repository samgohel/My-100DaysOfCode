public class UsingDP {

	public static void main(String[] args) {
		int[] input = { 10, 8, 5, -2, 47, -10, 5 };
		System.out.println("Max. Cont. Sum is: " + maxSumSubArray(input));
	}

	static int maxSumSubArray(int[] input) {
		int size = input.length;
		int maxSum = input[0];
		int currentMax = input[0];

		for (int i = 1; i < size; i++) {
			currentMax = Math.max(input[i], currentMax + input[i]);
			maxSum = Math.max(maxSum, currentMax);
		}
		return maxSum;
	}

}
