public class WithDuplicateHandling {

	public static void findUnion(int[] input1, int[] input2) {
		int m = input1[input1.length - 1];
		int n = input2[input2.length - 1];

		int ans = 0;

		if (m > n) {
			ans = m;
		} else {
			ans = n;
		}

		int[] newTable = new int[ans + 1];
		System.out.print(input1[0] + " ");

		++newTable[input1[0]];

		for (int i = 1; i < input1.length; i++) {
			if (input1[i] != input2[i - 1]) {
				System.out.print(input1[i] + " ");
				++newTable[input1[i]];
			}
		}

		for (int j = 0; j < input2.length; j++) {
			if (newTable[input2[j]] == 0) {
				System.out.print(input2[j] + " ");
				++newTable[input2[j]];
			}
		}
	}

	public static void main(String[] args) {
		int[] input1 = { 4, 5, 6, 7, 8, 8 };
		int[] input2 = { 1, 2, 3, 4, 5, 6, 6 };

		int size1 = input1.length;
		int size2 = input2.length;

		findUnion(input1, input2);
	}

}
