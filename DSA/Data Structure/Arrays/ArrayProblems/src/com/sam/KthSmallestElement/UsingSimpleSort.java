public class UsingSimpleSort {

	public static void main(String[] args) {
		Integer[] inputArray = { 1, 2, 6, 8, 9, 4, 2, 3 };
		System.out.println("K'th smallest element is " + usingSortingAlgo(inputArray, 2));
	}

	public static int usingSortingAlgo(Integer[] input, int k) {
		Arrays.sort(input);
		return input[k - 1];
	}

}