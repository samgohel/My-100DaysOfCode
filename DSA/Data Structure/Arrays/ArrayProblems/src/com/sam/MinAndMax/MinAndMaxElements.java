public class Pair{
    public static class Pair{
        int min;
        int max;

       @Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Pair [min=").append(min).append(", max=").append(max).append("]");
			return builder.toString();
		}
    }

    public static void main(String[] args) {
		int[] inputArray = { 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 55, -5 };
		int size = inputArray.length;

		System.out.println("Min. & Max. Using Simple Linear Method: ");
		System.out.println(usingLinearSearch(inputArray, size));

		System.out.println("Min. & Max. Using Tournament Method: ");
		System.out.println(usingTournamentMethod(inputArray, 0, size - 1));

		System.out.println("Min. & Max. Using Tournament Method: ");
		System.out.println(usingComparePair(inputArray, size));
	}

	public static Pair usingLinearSearch(int[] input, int size) {
		Pair minmax = new Pair();
		int i;

		if (size == 1) {
			minmax.max = input[0];
			minmax.min = input[0];
			return minmax;
		}

		if (input[0] > input[1]) {
			minmax.max = input[0];
			minmax.min = input[1];
		} else {
			minmax.max = input[1];
			minmax.min = input[0];
		}

		for (i = 2; i < size; i++) {
			if (input[i] > minmax.max) {
				minmax.max = input[i];
			} else if (input[i] < minmax.min) {
				minmax.min = input[i];
			}
		}
		return minmax;
	}

	public static Pair usingTournamentMethod(int[] input, int low, int high) {
		Pair minmax = new Pair();
		Pair mml = new Pair();
		Pair mmr = new Pair();
		int mid;

		if (low == high) {
			minmax.max = input[low];
			minmax.min = input[low];
			return minmax;
		}

		if (high == low + 1) {
			if (input[low] > input[high]) {
				minmax.max = input[low];
				minmax.min = input[high];
			} else {
				minmax.max = input[high];
				minmax.min = input[low];
			}
			return minmax;
		}

		mid = (low + high) / 2;
		mml = usingTournamentMethod(input, low, mid);
		mmr = usingTournamentMethod(input, mid + 1, high);

		if (mml.min < mmr.min) {
			minmax.min = mml.min;
		} else {
			minmax.min = mmr.min;
		}

		if (mml.max > mmr.max) {
			minmax.max = mml.max;
		} else {
			minmax.max = mmr.max;
		}
		return minmax;
	}

	public static Pair usingComparePair(int[] input, int size) {
		Pair minmax = new Pair();
		int i;

		if (size % 2 == 0) {
			if (input[0] > input[1]) {
				minmax.max = input[0];
				minmax.max = input[1];
			} else {
				minmax.min = input[0];
				minmax.max = input[1];
			}
			i = 0;
		} else {
			minmax.min = input[0];
			minmax.max = input[0];
			i = 1;
		}

		while (i < size - 1) {
			if (input[i] > input[i + 1]) {
				if (input[i] > minmax.max) {
					minmax.max = input[i];
				}
				if (input[i + 1] < minmax.min) {
					minmax.min = input[i + 1];
				}
			} else {
				if (input[i + 1] > minmax.max) {
					minmax.max = input[i + 1];
				}
				if (input[i] < minmax.min) {
					minmax.min = input[i];
				}
			}
			i += 2;

		}
		return minmax;

	}
}