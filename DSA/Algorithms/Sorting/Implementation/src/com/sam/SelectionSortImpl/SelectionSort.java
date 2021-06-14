package com.sam.selectionSortImpl;

import java.util.Arrays;

public class SelectionSort {

	public static int[] performSort(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			int index = i;

			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] < numbers[index]) {
					index = j;
				}
			}

			int smallNumb = numbers[index];
			numbers[index] = numbers[i];
			numbers[i] = smallNumb;
		}
		return numbers;
	}

	public static void main(String[] args) {
		int[] numbers = { 12, 1, 8, 9, 5, 7, -5 };
		performSort(numbers);
		Arrays.stream(numbers).forEach(System.out::println);
	}

}
