public class UsingKadaneAlgo {

	public static void main(String[] args) {
		int[] input = { 10, 8, 5, -2, 47, -10, 5 };
		System.out.println("Max. Cont. Sum is: " + maxSumSubArray(input));
	}

	static int maxSumSubArray(int[] input) {
		int size = input.length;
		int maxSum = Integer.MIN_VALUE, currentMax = 0;

		for (int i = 0; i < size; i++) {
			currentMax = currentMax + input[i];

			if (maxSum < currentMax)
				maxSum = currentMax;

			if (currentMax < 0)
				maxSum = 0;
		}
		return maxSum;
	}

}