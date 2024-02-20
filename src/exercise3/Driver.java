package exercise3;

import java.util.Random;
import java.util.Arrays;

public class Driver
{

	public static final int SIZE = 100;
	public static final int UPPER_BOUND = 1000;
	public static void main( String[] args )
	{
		Integer[] nums = new Integer[SIZE];
		Random rand = new Random();

		for (int i = 0; i < SIZE; i++) {
			nums[i] = rand.nextInt(UPPER_BOUND);
			System.out.println(nums[i]);
		}

		System.out.println("This is the unsorted array:\n**************************************\n" + Arrays.toString(nums) + "\n**************************************");

		String entry = System.console().readLine("Enter sorting algorithm to use (b,i,s or q): ");

		switch (entry) {
			case "b":
				bubbleSort(nums);
				System.out.println("Bubble Sorted array:\n" + "**************************************\n" + Arrays.toString(bubbleSort(nums)) + "\n**************************************");
				break;
			case "i":
				System.out.println("Insertion Sort not implemented");
				break;
			case "s":
				System.out.println("Selection Sort not implemented");
				break;
			case "q":
				System.out.println("Quick Sort not implemented");
				break;

			default:
				System.out.println("Invalid entry");
				break;
		}
	}
	public static Integer[] bubbleSort(Integer[] nums) {
		int temp = 0;
		for (int i = 0; i < SIZE; i++) {
			for (int j = 1; j < (SIZE - i); j++) {
				if (nums[j - 1] > nums[j]) {
					temp = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums;
	}
}
