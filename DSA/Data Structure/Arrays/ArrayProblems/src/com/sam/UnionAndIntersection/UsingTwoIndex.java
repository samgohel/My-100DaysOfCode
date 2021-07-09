public class UsingTwoIndex {

	static int findUnion(int input1[], int input2[], int size1, int size2) {
		int i = 0;
		int j = 0;

		while (i < size1 && j < size2) {
			if (input1[i] < input2[j])
				System.out.print(input1[i++] + " ");
			else if (input2[j] < input1[i])
				System.out.print(input2[j++] + " ");
			else {
				System.out.print(input2[j++] + " ");
				i++;
			}
		}

		while (i < size1) {
			System.out.print(input1[i++] + " ");
		}
		while (j < size2) {
			System.out.print(input2[j++] + " ");
		}

		return 0;
	}

	public static void main(String[] args) {
		int[] input1 = { 4, 5, 6, 7, 8, 4 };
		int[] input2 = { 1, 2, 3, 4, 5, 6, 6 };

		int size1 = input1.length;
		int size2 = input2.length;

		findUnion(input1, input2, size1, size2);
	}
}