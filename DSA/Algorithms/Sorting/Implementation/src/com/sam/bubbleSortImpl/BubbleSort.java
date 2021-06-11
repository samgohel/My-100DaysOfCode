package com.sam.bubbleSortImpl;

import java.util.Arrays;

public class BubbleSort {

	public static int[] performSort(int[] numbers) {

		for (int i = 0; i < numbers.length - 1; i++) {
			boolean isSwapped = false;

			for (int j = 0; j < numbers.length - 1 - i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
					isSwapped = true;
				}
			}
			if (!isSwapped)
				break;

		}
		return numbers;

	}

	public static void main(String[] args) {
		int[] numbers = { 1, 8, 9, 5, 7 };
		performSort(numbers);
		Arrays.stream(numbers).forEach(System.out::println);
	}

}
