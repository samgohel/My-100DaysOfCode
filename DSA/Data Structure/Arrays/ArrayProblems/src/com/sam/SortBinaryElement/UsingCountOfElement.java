public class UsingCountOfElement {

	public static void printArray(int[] input, int size) {
		for (int ele : input) {
			System.out.println(ele + " ");
		}

	}

	public static void sortElement(int[] input, int size) {
		int i;
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;

		for (i = 0; i < size; i++) {
			switch (input[i]) {
			case 0:
				count0++;
				break;
			case 1:
				count1++;
				break;
			case 2:
				count2++;
				break;
			}
		}

		i = 0;

		while (count0 > 0) {
			input[i++] = 0;
			count0--;
		}

		while (count1 > 0) {
			input[i++] = 1;
			count1--;
		}

		while (count2 > 0) {
			input[i++] = 2;
			count2--;
		}

		printArray(input, size);

	}

	public static void main(String[] args) {
		int[] input = { 0, 1, 2, 2, 1, 0, 1, 2, 1, 2 };
		int size = input.length;

		sortElement(input, size);
	}

}