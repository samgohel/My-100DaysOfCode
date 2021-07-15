public class UsingOptKadane {

	public static void main(String[] args) {
		int[] input = { 10, 8, 5, -2, 47, -10, 5 };
		System.out.println("Max. Cont. Sum is: " + maxSumSubArray(input));
	}

	static int maxSumSubArray(int[] input) {
		int size = input.length;
		int maxSum = input[0], currentMax = 0;
		for (int i = 0; i < size; i++) {
			currentMax = currentMax + input[i];
			if (currentMax < 0)
				currentMax = 0;
			else if (maxSum < currentMax) {
				maxSum = currentMax;
			}
		}
		return maxSum;
	}

}